package com.davidread.washingtontourguide.Models;

/**
 * {@link Place} is a model class that represents a place of interest in Washington. Each
 * {@link Place} object has a name, address, and description.
 */
public class Place {

    private String name;
    private String address;
    private String description;

    /**
     * Constructs a new {@link Place} object.
     *
     * @param name        Name of the place.
     * @param address     Street address of the place.
     * @param description Paragraph description of the place.
     */
    public Place(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    /**
     * Get the name of the place.
     *
     * @return The name of the place.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the address of the place.
     *
     * @return The address of the place.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Get the description of the place.
     *
     * @return The description of the place.
     */
    public String getDescription() {
        return description;
    }
}
