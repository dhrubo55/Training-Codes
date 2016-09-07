import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class Department_Parser {

	public static void main(String[] args) throws ParserConfigurationException {
	
		DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
		DocumentBuilder f = d.newDocumentBuilder();
		try {
			Document docu = f.parse(new File("NewFile1.xml"));
			
			NodeList list1 = docu.getElementsByTagName("Employee");
			System.out.println("total element is :"+list1.getLength());
			
			int length = list1.getLength();
			System.out.println(length);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
