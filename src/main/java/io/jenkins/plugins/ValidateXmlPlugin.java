package io.jenkins.plugins;

public class ValidateXmlPlugin {
    public static void main(String[] args) {
        System.out.println("Hello");
        ReadXMLFile readXMLFile = new ReadXMLFile();
        readXMLFile.read("C:\\Users\\lmarrone\\Estudos\\validateXmlPlugin\\src\\main\\resources\\staff.xml");
    }
}
