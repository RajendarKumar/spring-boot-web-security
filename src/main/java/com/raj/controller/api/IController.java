/**
 * 
 */
package com.raj.controller.api;

import java.util.List;

import org.springframework.ui.ModelMap;

import com.raj.model.Emp;

/**
 * @author Rajendar Kumar
 *
 */
public interface IController {

	/**
	 * <p>Method is used to login in application.<p>
	 * @param modelMap
	 * @return The welcome page.
	 */
	public String loginPage(ModelMap modelMap);
	/**
	 * <p>Method will return the {@link Emp} with given employee id.<p>
	 * @param empId
	 * @return The employee for given employee id.
	 */
	public Emp getEmp(String empId);
	/**
	 * <p>Method will return all the {@link Emp}.<p>
	 * @return All the employees.
	 */
	public List<Emp> getAllEmp();
}
