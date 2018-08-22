package br.com.alura.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ConversorParaHTML {

	public static void main(String[] args)
			throws FileNotFoundException, TransformerFactoryConfigurationError, TransformerException {

		InputStream xml = new FileInputStream("src/vendas.xml");
		Source xmlSource = new StreamSource(xml);		
		
		InputStream xsl = new FileInputStream("src/xmlParaHTML.xsl");
		Source source = new StreamSource(xsl);
		
		Transformer transformer = TransformerFactory.newInstance().newTransformer(source);
		StreamResult outputTarget = new StreamResult("src/vendas.html");
		transformer.transform(xmlSource, outputTarget );
	}

}
