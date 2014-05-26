package com.dao;

import java.io.Serializable;
import java.util.List;

import com.bean.Effect;

public interface EffectDao {
	public List<Effect> getAllEffect(String hql, Serializable... serializables);
}
