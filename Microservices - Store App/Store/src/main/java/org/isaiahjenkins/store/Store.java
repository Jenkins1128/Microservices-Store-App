package org.isaiahjenkins.store;

import org.isaiahjenkins.model.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * Store model and view controller class.
 */
@Controller
public class Store{

	/** The model and view. */
	private ModelAndView modelAndView;

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Home mapping.
	 *
	 * @return the string
	 */
	@RequestMapping("/")
	public String home(){
		return "home";
	}

	/**
	 * Samsung model and view.
	 *
	 * @param brandName the brand name
	 * @return the model and view
	 */
	@RequestMapping("/{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName){

		Devices result;

		modelAndView = new ModelAndView("viewDevices");

		switch(brandName.toLowerCase()){
		case "samsung":
			// connect with the microservice
			result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;
		case "apple":
			// connect with the microservice
			result = restTemplate.getForObject("http://APPLE/apple/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;
		default:
			return new ModelAndView("redirect: /error");

		}
	}
}
