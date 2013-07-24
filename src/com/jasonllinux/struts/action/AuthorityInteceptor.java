package com.jasonllinux.struts.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInteceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String username = (String)session.get("username");
		
		if(null != username) {
			System.out.println("拦截通过");
			return invocation.invoke();
		}
		
		System.out.println("登陆拦截");
		ctx.put("tip", "请先登陆");
		
		return Action.LOGIN;
		
	}

}
