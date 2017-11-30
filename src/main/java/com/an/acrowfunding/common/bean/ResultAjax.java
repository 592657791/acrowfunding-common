package com.an.acrowfunding.common.bean;

import java.util.HashMap;
import java.util.Map;

public class ResultAjax {

	private String msg;
	private boolean success;
	
	private Map<String, Object> map = new HashMap<>();

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public ResultAjax add(String key,Object value) {
		this.getMap().put(key, value);
		return this;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	
	
}
