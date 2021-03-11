package org.isaiahjenkins.store;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ErrorController class maps to a custom error path.
 */
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController{

	/**
	 * Gets the error path.
	 *
	 * @return the error path
	 */
	@Override
	public String getErrorPath(){
		return "/error";
	}

	/**
	 * Error.
	 *
	 * @return the string
	 */
	@RequestMapping("/error")
	public String error(){
		return "error";
	}

}
