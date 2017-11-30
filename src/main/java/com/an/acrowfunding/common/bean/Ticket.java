package com.an.acrowfunding.common.bean;

public class Ticket {
	private Integer id,memberid;
	private String piid,status,authcode,pstep;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public String getPiid() {
		return piid;
	}
	public void setPiid(String piid) {
		this.piid = piid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuthcode() {
		return authcode;
	}
	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}
	public String getPstep() {
		return pstep;
	}
	public void setPstep(String pstep) {
		this.pstep = pstep;
	}
	public Ticket(Integer id, Integer memberid, String piid, String status, String authcode, String pstep) {
		super();
		this.id = id;
		this.memberid = memberid;
		this.piid = piid;
		this.status = status;
		this.authcode = authcode;
		this.pstep = pstep;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", memberid=" + memberid + ", piid=" + piid + ", status=" + status + ", authcode="
				+ authcode + ", pstep=" + pstep + "]";
	}

	
}
