package com.davidread.washingtontourguide.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Place} is a model class that represents a place of interest in Washington. Each
 * {@link Place} object has a {@link String} object for name, address, and description. Implements
 * {@link Parcelable} so that objects may be passed as arguments to activities and fragments.
 */
public class Place implements Parcelable {

    // Object that generates instances of this class from a Parcel object.
    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    // Member variables.
    private String name;
    private String address;
    private String description;

    /**
     * Constructs a new {@link Place} object given its member variables.
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
     * Construct a new {@link Place} object given a {@link Parcel} object.
     *
     * @param in The {@link Parcel} object that contains the member variables of the {@link Place}
     *           object.
     */
    protected Place(Parcel in) {
        name = in.readString();
        address = in.readString();
        description = in.readString();
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

    /**
     * Returns an int describing the type of objects contained in the {@link Parcelable} instance.
     *
     * @return An int describing the type of objects contained in the {@link Parcelable} instance.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Converts the member variables of this object into a {@link Parcel} object.
     *
     * @param dest  The {@link Parcel} object where the member variables will be stored.
     * @param flags Additional flags.
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(description);
    }
}
