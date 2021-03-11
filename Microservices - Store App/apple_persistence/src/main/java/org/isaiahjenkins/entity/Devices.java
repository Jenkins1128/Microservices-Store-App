package org.isaiahjenkins.entity;

import java.util.List;

/**
 * Devices model.
 */
public class Devices {
    /**
     * The Devices.
     */
    List<Device> devices;
    /**
     * The Brand name.
     */
    String brandName;

    /**
     * Instantiates a new Devices.
     */
    public Devices() {
    }

    /**
     * Instantiates a new Devices.
     *
     * @param devices the devices
     */
    public Devices(List<Device> devices) {
        this.devices = devices;
        this.brandName = "Apple";
    }

    /**
     * Instantiates a new Devices.
     *
     * @param devices the devices
     * @param brand   the brand
     */
    public Devices(List<Device> devices, String brand) {
        this.devices = devices;
        this.brandName = brand;
    }

    /**
     * Gets devices.
     *
     * @return the devices
     */
    public List<Device> getDevices() {
        return devices;
    }

    /**
     * Sets devices.
     *
     * @param devices the devices
     */
    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brandName;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brandName = brand;
    }
}
