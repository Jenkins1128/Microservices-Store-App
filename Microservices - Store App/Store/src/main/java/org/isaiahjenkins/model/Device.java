package org.isaiahjenkins.model;

/**
 * Device model.
 */
public class Device{

	/** The id. */
	int id;

	/** The name. */
	String name;

	/** The type. */
	String type;

	/**
	 * Instantiates a new device.
	 */
	public Device(){
	}

	/**
	 * Instantiates a new device.
	 *
	 * @param name the name
	 * @param type the type
	 */
	public Device(String name, String type){
		this.name = name;
		this.type = type;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName(){
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType(){
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId(){
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString(){
		return "Device{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
	}
}
