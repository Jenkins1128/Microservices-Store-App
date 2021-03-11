package org.isaiahjenkins.dao;

import org.isaiahjenkins.entity.Device;
import org.springframework.data.repository.CrudRepository;

/**
 * DAO interface.
 */
public interface DAO extends CrudRepository<Device, Integer> {
}
