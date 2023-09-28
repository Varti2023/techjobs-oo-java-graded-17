package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //COMMON FIELDS
    private int id;
    private static int nextId = 1;
    private String value;

    // CONSTRUCTORS
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // CUSTOM METHODS
    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
