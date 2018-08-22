package br.alura.controle.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import br.com.alura.model.Produto;

public class LeStAX {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		InputStream ips = new FileInputStream("src/vendas.xml");
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLEventReader eventos = factory.createXMLEventReader(ips);
		Produto produto = new Produto();

		List<Produto> produtos = new ArrayList<>();
		XMLEvent evento = eventos.nextEvent();

		if (evento.isStartElement() && evento.asStartElement().getName().getLocalPart().equals("produto")) {
			produto = new Produto();
		} else if (evento.isStartElement() && evento.asEndElement().getName().getLocalPart().equals("nome")) {
			evento = eventos.nextEvent();
			String conteudo = evento.asCharacters().getData();
			produto.setNome(conteudo);
		} else if (evento.isStartElement() && evento.asEndElement().getName().getLocalPart().equals("preco")) {
			evento = eventos.nextEvent();
			String conteudo = evento.asCharacters().getData();
			double preco = Double.parseDouble(conteudo);
			produto.setPreco(preco);
		} else if (evento.isEndElement() && evento.asEndElement().getName().getLocalPart().equals("produto")) {

			produtos.add(produto);
			System.out.println(produto);

		}
		System.out.println(produtos);

		/// fim
	}

}
