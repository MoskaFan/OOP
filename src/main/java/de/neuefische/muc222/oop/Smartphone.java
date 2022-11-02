package de.neuefische.muc222.oop;

import java.util.Arrays;

public class Smartphone {
    double size;
    String color;
    String brand;



    String[] functions;
    int capacity;
    int batterySize;
    boolean touchscreen;

    public Smartphone(double size, String color, String brand, String[] functions, int capacity, int batterySize, boolean touchscreen) {
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.functions = functions;
        this.capacity = capacity;
        this.batterySize = batterySize;
        this.touchscreen = touchscreen;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", functions=" + Arrays.toString(functions) +
                ", capacity=" + capacity +
                ", batterySize=" + batterySize +
                ", touchscreen=" + touchscreen +
                '}';
    }
}
