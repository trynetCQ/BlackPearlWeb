package com.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Effect;
import com.biz.EffectBiz;
import com.dao.EffectDao;
import com.dao.impl.EffectDaoImpl;

public class EffectBizImpl implements EffectBiz {

	private EffectDao ed = new EffectDaoImpl();

	@Override
	public List<Effect> getAllEffect(Serializable... serializables) {
		String hql = "from Effect";
		List<Effect> effects = ed.getAllEffect(hql, serializables);
		return effects;
	}

}
