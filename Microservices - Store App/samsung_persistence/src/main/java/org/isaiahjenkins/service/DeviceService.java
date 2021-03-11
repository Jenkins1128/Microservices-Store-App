package org.isaiahjenkins.service;

import org.isaiahjenkins.dao.DAO;
import org.isaiahjenkins.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Device service layer
 */
@Service
public class DeviceService {

    @Autowired
    private DAO dao;

    /**
     * Get all devices list.
     *
     * @return the list
     */
    public List<Device> getAllDevices(){
        List<Device> devices = new ArrayList<>();
        for(Device d : dao.findAll()){
            devices.add(d);
        }
        return devices;
    }
}
