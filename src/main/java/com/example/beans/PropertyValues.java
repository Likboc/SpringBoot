package com.example.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean 的属性列表
 */
public class PropertyValues {
    List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 添加属性值
     * @param propertyValue
     */
    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    /**
     * 遍历求属性值
     * @param propertyName
     * @return
     */
    public PropertyValue getPropertyValue(String propertyName) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue pv = this.propertyValueList.get(i);
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
