package org.isaiahjenkins.controller;

import org.isaiahjenkins.entity.Device;
import org.isaiahjenkins.entity.Devices;
import org.isaiahjenkins.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Controller class
 */
@RestController
public class Controller {

    /**
     * Device service layer
     */
    @Autowired
    private DeviceService deviceService;

    /**
     * Myhome string.
     *
     * @return the string
     */
    @RequestMapping("/")
    public String myhome(){
        return "Hello World!";
    }

    /**
     * Get all devices devices.
     *
     * @return the devices
     */
    @GetMapping("devices")
    public Devices getAllDevices(){
        List<Device> listOfDevices = deviceService.getAllDevices();
        Devices dvcs = new Devices(listOfDevices);
        return dvcs;
    }
}
