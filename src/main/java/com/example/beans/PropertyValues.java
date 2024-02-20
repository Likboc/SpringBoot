package com.example.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * bean class field values? mainly for List<PropertyValue>
 */
public class PropertyValues {
    List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * add & update propertyValue of Bean
     * @param propertyValue
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        // first rm repeat element
        propertyValueList.add(propertyValue);
    }

    /**
     * get propertyValue of Bean
     * @param propertyName
     * @return
     */
    public PropertyValue getPropertyValue(String propertyName){
        return null;
    }
}
