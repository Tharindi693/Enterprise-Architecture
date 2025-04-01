/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xml;

import org.w3c.dom.*;
import javax.xml.parsers.*;
public class XmlParser {
    public static void main(String[] args) {
try {
// Create a new DocumentBuilderFactory and DocumentBuilder
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();

// Parse the XML file
Document document = builder.parse("D:\\java exercises\\XML\\src\\xml\\books.xml");

// Normalize the document
document.getDocumentElement().normalize();

// Get the root element (library)
 NodeList nodeList = document.getElementsByTagName("book");

 // Loop through each book in the XML document
for (int i = 0; i < nodeList.getLength(); i++) {
Node node = nodeList.item(i);

if (node.getNodeType() == Node.ELEMENT_NODE) {
Element element = (Element) node;

// Get and print the details of each book
String title = element.getElementsByTagName("title").item(0).getTextContent();
String author = element.getElementsByTagName("author").item(0).getTextContent();
String year = element.getElementsByTagName("year").item(0).getTextContent();
String genre = element.getElementsByTagName("genre").item(0).getTextContent();

System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
System.out.println("Genre: " + genre);
System.out.println("-----------");
}
}

} catch (Exception e) {
e.printStackTrace();
}
}
}
