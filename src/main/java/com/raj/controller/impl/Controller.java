package com.raj.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raj.commons.Common;
import com.raj.controller.api.IController;
import com.raj.model.Emp;
import com.raj.service.api.IProcessService;

/**
 * @author Rajendar Kumar
 *
 */
@RestController
public class Controller implements IController {

	@Autowired
	@Qualifier("processService")
	private IProcessService processService;
	/* (non-Javadoc)
	 * @see com.raj.controller.api.IController#login(org.springframework.ui.ModelMap)
	 */
	@Override
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(ModelMap modelMap) {
		modelMap.put(Common.NAME, Common.WELCOME);
		return Common.WELCOME;
	}

	/* (non-Javadoc)
	 * @see com.raj.controller.api.IController#getEmp(java.lang.String)
	 */
	@Override
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public Emp getEmp(@PathVariable String empId) {
		return processService.getEmp(empId);
	}

	/* (non-Javadoc)
	 * @see com.raj.controller.api.IController#getAllEmp()
	 */
	@Override
	@RequestMapping(value="/emps",method=RequestMethod.POST)
	public List<Emp> getAllEmp() {
		return processService.getEmployees();
	}
	
	

}
