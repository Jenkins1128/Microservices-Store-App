package org.isaiahjenkins.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Device model.
 */
@Entity
@Table(name="apple")
public class Device {
    /**
     * The Id.
     */
    @Id
    @Column(name="id")
    int id;
    /**
     * The Name.
     */
    @Column(name="name")
    String name;
    /**
     * The Type.
     */
    @Column(name="type")
    String type;


    /**
     * Instantiates a new Device.
     */
    public Device() {
    }

    /**
     * Instantiates a new Device.
     *
     * @param id   the id
     * @param name the name
     * @param type the type
     */
    public Device(int id, String name, String type) {
        this.id = id;
        this.name = name;
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
}
