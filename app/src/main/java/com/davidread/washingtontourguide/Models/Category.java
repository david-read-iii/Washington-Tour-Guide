package com.davidread.washingtontourguide.Models;

import java.util.ArrayList;

/**
 * {@link Category} is a model class that represents a category of places of interest in Washington.
 * Each {@link Category} object has a {@link String} object representing a name and an
 * {@link ArrayList} of places of interest.
 */
public class Category {

    // Member variables.
    private String name;
    private ArrayList<Place> places;

    /**
     * Constructs a new {@link Category} object given its member variables.
     *
     * @param name   Name of the category.
     * @param places {@link ArrayList} of {@link Place} objects in the category.
     */
    public Category(String name, ArrayList<Place> places) {
        this.name = name;
        this.places = places;
    }

    /**
     * Get the name of the category.
     *
     * @return The name of the category.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the {@link ArrayList} of {@link Place} objects for the category.
     *
     * @return An {@link ArrayList} of {@link Place} objects for the category.
     */
    public ArrayList<Place> getPlaces() {
        return places;
    }
}
