package br.com.alura.controle;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;




public class Sistema {
	public static void main(String[] args) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setNamespaceAware(true);
		factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
							"http://www.w3.org/2001/XMLSchema");

		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse("src/vendas.xml");
		Element venda = document.getDocumentElement();
		System.out.println(venda.getAttribute("moeda"));
		Element tagFormaDePagamento = (Element) document.getElementsByTagName("formaDePagamento").item(0);
		String formaDePagamento = tagFormaDePagamento.getTextContent();

		System.out.println(formaDePagamento);
		
		String exp = "src/vendas/produtos/produto[1]";
		XPath path = XPathFactory.newInstance().newXPath();
		
		XPathExpression xPathExpression = path.compile(exp);	
		

		NodeList produtos = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);

		for (int i = 0; i < produtos.getLength(); i++) {
			Element prod = (Element) produtos.item(i);
			System.out.println("===============================================");
			System.out.println("Nome do Produto: " + prod.getElementsByTagName("nome").item(0).getTextContent());
			System.out.println("Peço: " + prod.getElementsByTagName("preco").item(0).getTextContent());
			System.out.println("===============================================");
		}

	}

}
