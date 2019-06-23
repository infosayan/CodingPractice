package com.java.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	
	 public static void main(String[] args) throws MalformedURLException {
		    URL url = new URL("http://localhost:8080/SoapTest/services/Calculator?wsdl");
		    QName qname = new QName("http://soap.java.com", "CalculatorService");
		    Service service = Service.create(url, qname);
		    Calculator calculator = service.getPort(Calculator.class);
		    System.out.println("Server said: " + calculator.add(5, 6));
		  }
}
