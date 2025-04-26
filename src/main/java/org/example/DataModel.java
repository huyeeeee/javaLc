package org.example;

import java.util.Map;
import java.util.Objects;

public class DataModel {

    Object value;
    Map<String,DataModel> map;

    public Map<String, DataModel> getMap() {
        return map;
    }

    public void setMap(Map<String, DataModel> map) {
        this.map = map;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
