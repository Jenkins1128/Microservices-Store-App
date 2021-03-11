package org.isaiahjenkins.model;

import java.util.List;

/**
 * Devices model.
 */
public class Devices{

	/** The devices. */
	List<Device> devices;

	/** The brand name. */
	String brandName;

	/**
	 * Instantiates a new devices.
	 */
	public Devices(){
	}

	/**
	 * Instantiates a new devices.
	 *
	 * @param devices the devices
	 */
	public Devices(List<Device> devices){
		this.devices = devices;
	}

	/**
	 * Gets the devices.
	 *
	 * @return the devices
	 */
	public List<Device> getDevices(){
		return devices;
	}

	/**
	 * Sets the devices.
	 *
	 * @param devices the new devices
	 */
	public void setDevices(List<Device> devices){
		this.devices = devices;
	}

	/**
	 * Gets the brand name.
	 *
	 * @return the brand name
	 */
	public String getBrandName(){
		return brandName;
	}

	/**
	 * Sets the brand name.
	 *
	 * @param brandName the new brand name
	 */
	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString(){
		return "Devices{" + "devices=" + devices + '}';
	}
}
