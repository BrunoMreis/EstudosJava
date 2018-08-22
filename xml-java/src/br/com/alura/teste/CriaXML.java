package br.com.alura.teste;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import br.com.alura.model.Venda;

public class CriaXML {

	public static void main(String[] args) {
		
		
		JAXBContext contexto = JAXBContext.newInstance(Venda.class);
		Unmarshaller unmarshaller = contexto.createUnmarshaller();
		Venda venda = (Venda) unmarshaller.unmarshal(new File("src/venda.xml"));


	}

}
