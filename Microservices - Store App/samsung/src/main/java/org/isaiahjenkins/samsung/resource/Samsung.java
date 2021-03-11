package org.isaiahjenkins.samsung.resource;

import com.netflix.discovery.converters.Auto;
import org.isaiahjenkins.samsung.model.Device;
import org.isaiahjenkins.samsung.model.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

/**
 * Samsung controller.
 */
@RestController
@RequestMapping("/samsung")
public class Samsung {

    /**
     * The Rest template.
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * Get devices.
     *
     * @return the devices
     */
    @RequestMapping("/devices")
    public Devices getDevices(){
        Devices devices = restTemplate.getForObject("http://SAMSUNGP/devices", Devices.class);
        return devices;
    }
}
