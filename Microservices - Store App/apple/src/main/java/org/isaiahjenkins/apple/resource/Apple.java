package org.isaiahjenkins.apple.resource;

import com.netflix.discovery.converters.Auto;
import org.isaiahjenkins.apple.model.Device;
import org.isaiahjenkins.apple.model.Devices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Apple resource
 */
@RestController
@RequestMapping("/apple")
public class Apple {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Get devices devices.
     *
     * @return the devices
     */
    @RequestMapping("/devices")
    public Devices getDevices(){
        //this is usually a database
        Devices devices = restTemplate.getForObject("http://APPLEP/devices", Devices.class);
        return devices;
    }
}
