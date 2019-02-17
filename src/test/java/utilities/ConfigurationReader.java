package utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ConfigurationReader {

    // open Properties obj (pre Defined in Java) with the name 'properties'

    private static Properties properties;

    // read key value for property
    static{
        // show configuration file path and store into the String
        String path = "configuration.properties";

        // If file not foung try-catch block throws an Exception
        try{

            //open FileInputStream to read file in the defined path
            FileInputStream file = new FileInputStream(path);

            //initialize the 'properties' object
            properties = new Properties();

            //load file into the properties object
            properties.load(file);

            //close the file
            file.close();

        }catch (Exception e) {
            System.out.println("Path" + path + "- not found");
        }
    }

    // get the key value by using getProperty method
    public static String getProperty(String key) {return properties.getProperty(key);}
}
