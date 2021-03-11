package org.isaiahjenkins.apple.model;

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
    String brandName = "Apple";

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
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
