package com.company;
import  java.util.List;
import java.util.ArrayList;
import java.util.Objects;


public class Resident {
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Resident(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Resident{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resident resident = (Resident) o;
        return Objects.equals(name, resident.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}