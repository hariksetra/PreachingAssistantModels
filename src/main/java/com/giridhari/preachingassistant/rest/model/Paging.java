package com.giridhari.preachingassistant.rest.model;

/**
 * Holds paging information.
 * 
 * @author shyam
 *
 */
public class Paging {
	
	private int totalPages;
	private long totalElements;
	private boolean isLast;
	private int pageSize;
	private int pageNumber;
	private String sortedOrder;
	private boolean isFirst;
	private int numberOfElements;
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getSortedOrder() {
		return sortedOrder;
	}
	public void setSortedOrder(String sortedOrder) {
		this.sortedOrder = sortedOrder;
	}
	public boolean isFirst() {
		return isFirst;
	}
	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	public int getNumberOfElements() {
		return numberOfElements;
	}
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	
	
}
