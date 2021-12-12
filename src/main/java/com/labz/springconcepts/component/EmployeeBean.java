package com.labz.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	private int eid;
	private String ename;
	
	@Autowired
	private DepartmentBean deptBean;
	
	public final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
	
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	
	@Autowired
	public void setDeptBean(DepartmentBean deptBean) {
		logger.trace("Autowiring using Autowire annotation at Setter");
		this.deptBean = deptBean;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee ID : "+eid);
		logger.debug("Employee Name : "+ename);
		deptBean.setDeptName("Information Technology");
		logger.debug("Department Name: "+deptBean.getDeptName());
	}
}

