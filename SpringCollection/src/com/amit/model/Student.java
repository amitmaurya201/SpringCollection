package com.amit.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student{
	
	 private List<String> mobilelist;
	 private Set<String>  mobileset;
	 private Map<String, String> mobilemap;
	 private Properties mobileprops;
	public List<String> getMobilelist() {
		return mobilelist;
	}
	public void setMobilelist(List<String> mobilelist) {
		this.mobilelist = mobilelist;
	}
	public Set<String> getMobileset() {
		return mobileset;
	}
	public void setMobileset(Set<String> mobileset) {
		this.mobileset = mobileset;
	}
	public Map<String, String> getMobilemap() {
		return mobilemap;
	}
	public void setMobilemap(Map<String, String> mobilemap) {
		this.mobilemap = mobilemap;
	}
	public Properties getMobileprops() {
		return mobileprops;
	}
	public void setMobileprops(Properties mobileprops) {
		this.mobileprops = mobileprops;
	}
	 

}
