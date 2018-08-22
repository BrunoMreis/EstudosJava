package br.com.alura.bytebank.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];
		
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;
        
        for (int i : idades) {
			System.out.println(i);
		}
		
		
	}

}
