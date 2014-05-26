package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Effect;
import com.dao.EffectDao;
import com.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class EffectDaoImpl implements EffectDao {

	@Override
	public List<Effect> getAllEffect(String hql, Serializable... serializables) {
		List<Effect> effects =  HibernateUtil.getQuery(hql, serializables);
		return effects;
	}

}
