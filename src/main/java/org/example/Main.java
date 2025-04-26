package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        COlOR[] values = COlOR.values();
        for (COlOR value : values) {
            System.out.println(value);
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
enum COlOR{
    RED,GREEN,BLUE
        }
