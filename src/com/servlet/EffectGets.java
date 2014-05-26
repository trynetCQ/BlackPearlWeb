package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Effect;
import com.biz.EffectBiz;
import com.biz.impl.EffectBizImpl;

public class EffectGets extends HttpServlet {
	private static final long serialVersionUID = 3683797648482606881L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		EffectBiz eb = new EffectBizImpl();
		List<Effect> effects = eb.getAllEffect();
		if (effects != null) {
			request.setAttribute("effects", effects);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}
	}
}
