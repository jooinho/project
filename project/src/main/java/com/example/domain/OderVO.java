package com.example.domain;

import java.util.Date;

public class OderVO {
	private String ocode; //��ǰ�ڵ�
	private String oename; //��ǰ�����̸�
	private String okname; //��ǰ�ѱ��̸�
	private String omodel; //��ǰ�𵨸�
	private Date odate; //��ǰ���Ź��Ǹ�Ȯ����
	private String osell; //
	private String obuy;
	private String oid;
	private int oprice;
	public String getOcode() {
		return ocode;
	}
	public void setOcode(String ocode) {
		this.ocode = ocode;
	}
	public String getOename() {
		return oename;
	}
	public void setOename(String oename) {
		this.oename = oename;
	}
	public String getOkname() {
		return okname;
	}
	public void setOkname(String okname) {
		this.okname = okname;
	}
	public String getOmodel() {
		return omodel;
	}
	public void setOmodel(String omodel) {
		this.omodel = omodel;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public String getOsell() {
		return osell;
	}
	public void setOsell(String osell) {
		this.osell = osell;
	}
	public String getObuy() {
		return obuy;
	}
	public void setObuy(String obuy) {
		this.obuy = obuy;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	
	@Override
	public String toString() {
		return "OderVO [ocode=" + ocode + ", oename=" + oename + ", okname=" + okname + ", omodel=" + omodel
				+ ", odate=" + odate + ", osell=" + osell + ", obuy=" + obuy + ", oid=" + oid + ", oprice=" + oprice
				+ "]";
	}
}
