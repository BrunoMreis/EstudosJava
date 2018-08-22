package br.com.alura.model.handler;

import java.io.FileInputStream;
import java.io.InputStream;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class LeitorDeProduto {

	public static void main(String[] args) throws SAXException, Exception {
		XMLReader leitor = XMLReaderFactory.createXMLReader();
		ProdutosHandler logica = new ProdutosHandler();
		leitor.setContentHandler(logica );
		InputStream ips = new FileInputStream("src/vendas.xml");
		InputSource is = new InputSource(ips);
		leitor.parse(is);
		
		System.out.println(logica.getProdutos());
	}

}
