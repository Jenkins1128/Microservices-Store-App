package org.isaiahjenkins.samsung.resource;

import org.isaiahjenkins.samsung.model.Device;
import org.isaiahjenkins.samsung.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

/**
 * Samsung resource.
 */
@RestController
@RequestMapping("/samsung")
public class Samsung {
    /**
     * Get devices devices.
     *
     * @return the devices
     */
    @RequestMapping("/devices")
    public Devices getDevices(){
        //this is usually a database
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Galaxy 5", "Smartphone"));
        devices.add(new Device("Note 9", "Smartphone"));

        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}
