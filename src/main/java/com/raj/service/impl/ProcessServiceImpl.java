/**
 * 
 */
package com.raj.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.raj.model.Emp;
import com.raj.service.api.IProcessService;

/**
 * @author Rajendar Kumar
 *
 */
@Service("processService")
public class ProcessServiceImpl implements IProcessService{

	private static final Map<String, Emp> EMPS = new HashMap<>();
	static {
		EMPS.put("1",new Emp("1", "Rajendar Kumar"));
		EMPS.put("2",new Emp("2", "Rajesh Kumar"));
	}
	/* (non-Javadoc)
	 * @see com.raj.service.api.IProcessService#getEmp(java.lang.String)
	 */
	@Override
	public Emp getEmp(String empId) {
		return EMPS.get(empId);
	}

	/* (non-Javadoc)
	 * @see com.raj.service.api.IProcessService#getEmployees()
	 */
	@Override
	public List<Emp> getEmployees() {
		return new ArrayList<>(EMPS.values());
	}

}
