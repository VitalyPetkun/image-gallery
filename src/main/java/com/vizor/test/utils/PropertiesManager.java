package com.vizor.test.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    private static final String CONFIG_PATH = "src/main/resources/config.properties";

    private PropertiesManager() {
    }

    private static Properties getProperties(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);

            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getConfigValue(String key) {
        return getProperties(CONFIG_PATH).getProperty(key);
    }
}
