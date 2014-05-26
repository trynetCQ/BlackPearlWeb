package com.biz;

import java.io.Serializable;
import java.util.List;

import com.bean.Effect;

public interface EffectBiz {
	public List<Effect> getAllEffect(Serializable... serializables);
}
