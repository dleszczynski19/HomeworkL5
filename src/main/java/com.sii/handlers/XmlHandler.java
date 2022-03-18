package com.sii.handlers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlHandler {

    public static void serialize(Object object, String fileName) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            xmlMapper.writeValue(new File("src/main/java/com.sii/output/" + fileName + ".xml"), object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}