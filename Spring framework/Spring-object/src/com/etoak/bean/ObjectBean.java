package com.etoak.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ObjectBean {
	
	private List<String> lists;
	private Set<String> sets;
	private Map<String,Object> maps;
	private Properties props;
	
	private Student stu;
	
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public Set<String> getSets() {
		return sets;
	}
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}

}
