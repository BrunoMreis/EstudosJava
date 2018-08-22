package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> palavras = new ArrayList<>();
		palavras.add("Alura");
		palavras.add("editura casa do código");
		palavras.add("Caelum");
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		Consumer<String> consumidor = new ConsumidorDeString();
		
		

//		Collections.sort(palavras,comparador);
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		for (String string : palavras) {
			System.out.println("teste"+ string);
		}
		palavras.forEach(System.out::println);
		
//		System.out.println(palavras);
		
		palavras.forEach(consumidor);

	}

}

class ComparadorDeStringPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		
		return 0;
	}

}
class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}