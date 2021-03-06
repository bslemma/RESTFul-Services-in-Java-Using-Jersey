package com.mum.model;

import java.util.List;

public class ActivitySearch {
	private int durationFrom;
	private int durationTo;
	List<String> descriptions;
	
	private ActivitySearchType searchType;
	
	
	
	public ActivitySearchType getSearchType() {
		return searchType;
	}
	public void setSearchType(ActivitySearchType searchType) {
		this.searchType = searchType;
	}
	public int getDurationFrom() {
		return durationFrom;
	}
	public void setDurationFrom(int durationFrom) {
		this.durationFrom = durationFrom;
	}
	public int getDurationTo() {
		return durationTo;
	}
	public void setDurationTo(int durationTo) {
		this.durationTo = durationTo;
	}
	public List<String> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}
	
	

}
