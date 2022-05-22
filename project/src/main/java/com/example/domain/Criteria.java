package com.example.domain;

public class Criteria extends ProductVO{
	private int page; // ����������
	private int perPageNum; // �� ������ ��� �����ͼ�
	private String searchType; // �˻�Ű
	private String keyword; // �˻���
	private String pcode;
	private String pccode;

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPccode() {
		return pccode;
	}

	public void setPccode(String pccode) {
		this.pccode = pccode;
	}

	public Criteria() {
		this(1, 10);
	}

	public Criteria(int page, int perPageNum) {
		this.page = page;
		this.perPageNum = perPageNum;
	}

	// 1�������� ��� pageStart�� 0
	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", searchType=" + searchType + ", keyword="
				+ keyword + ", pcode=" + pcode + ", pccode=" + pccode + "]";
	}
}
