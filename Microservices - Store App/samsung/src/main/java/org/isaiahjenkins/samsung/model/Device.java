package org.isaiahjenkins.samsung.model;

/**
 * Device model.
 */
public class Device {
    /**
     * The Id.
     */
    int id;
    /**
     * The Name.
     */
    String name;
    /**
     * The Type.
     */
    String type;

    /**
     * Instantiates a new Device.
     */
    public Device() {
    }

    /**
     * Instantiates a new Device.
     *
     * @param name the name
     * @param type the type
     */
    public Device(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
