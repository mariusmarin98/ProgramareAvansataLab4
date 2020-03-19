package com.company;

public class Hospital implements  Comparable<Hospital>{
    private String name;
    private int capacitate;

    public Hospital(String name, int capacitate) {
        this.name = name;
        this.capacitate = capacitate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacitate() {
        return capacitate ;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }


    public int compareTo(Hospital o){
        return this.name.compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }

}