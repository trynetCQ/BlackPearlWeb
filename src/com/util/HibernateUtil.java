package com.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("unchecked")
public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	private static Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return session;
	}

	public static void saveUpdateOrDelete(Integer result,
			Serializable serializables) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			if (result == 1) {
				session.save(serializables);
			}
			if (result == 2) {
				session.update(serializables);
			}
			if (result == 3) {
				session.delete(serializables);
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
	}

	public static List getQuery(String hql, Serializable... serializables) {
		Session session = null;
		List list = null;
		try {
			session = getSession();
			session.beginTransaction();
			Query query = session.createQuery(hql);
			if (serializables != null) {
				for (int i = 0; i < serializables.length; i++) {
					query.setParameter(i, serializables[i]);
				}
			}
			list = query.list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	public static List getQueryByIndex(Integer firstIndex, Integer maxCount,
			String hql, Serializable... args) {
		Session session = null;
		List list = null;
		try {
			session = getSession();
			session.beginTransaction();
			Query query = session.createQuery(hql);
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					query.setParameter(i, args[i]);
				}
			}
			query.setFirstResult((firstIndex - 1) * maxCount).setMaxResults(
					maxCount);
			list = query.list();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		return list;
	}

	public static Object getOne(String hql, Serializable... serializables) {
		Session session = null;
		Object arg = null;
		try {
			session = getSession();
			session.beginTransaction();
			Query query = session.createQuery(hql);
			if (serializables != null) {
				for (int i = 0; i < serializables.length; i++) {
					query.setParameter(i, serializables[i]);
				}
			}
			arg = query.uniqueResult();
			session.getTransaction().commit();
		} catch (HibernateException e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		return arg;
	}
}
