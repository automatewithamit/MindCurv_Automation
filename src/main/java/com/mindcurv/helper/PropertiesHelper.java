package com.mindcurv.helper;


import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//This Class helps to read different properties files in the project
public class PropertiesHelper {
    FileInputStream fis;
    Properties property;
    String projectPath = System.getProperty("user.dir");

    public PropertiesHelper(String propertyFileName) {
        try {
            fis = new FileInputStream(projectPath + "//src//main//resources//" + propertyFileName);
            property = new Properties();
            property.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Property File :: " + propertyFileName + " NOT  Found");
        } catch (IOException e) {
            System.out.println("Error while reading " + propertyFileName + "  File");
        }

    }

    public String getProperty(String propertyName) {
        String propertyValue = "";
        try {

            propertyValue = property.getProperty(propertyName);
            return propertyValue;
        } catch (Exception e) {
            return propertyValue;
        }
    }


}
