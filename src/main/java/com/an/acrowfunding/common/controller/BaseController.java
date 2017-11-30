package com.an.acrowfunding.common.controller;

import com.an.acrowfunding.common.bean.AJAXResult;

public class BaseController {
	private ThreadLocal<AJAXResult> results = new ThreadLocal<AJAXResult>();
	
	protected void start() {
		results.set(new AJAXResult());
	}
	
	protected void data( Object data ) {
		results.get().setData(data);
	}
	
	protected void success() {
		success(true);
	}
	
	protected void success(boolean flg) {
		results.get().setSuccess(flg);
	}
	
	protected void fail() {
		success(false);
	}
	
	protected Object end() {
		Object result = results.get();
		results.remove();
		return result;
	}

}
