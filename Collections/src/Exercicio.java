import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(28, "Bruno Moreira Reis");
		pessoas.put(23,"Leona Lona");
		pessoas.put(33,"Parry Ornitorrinto");
		pessoas.put(145, "Dona Clotides");
		
		 pessoas.keySet().forEach(idade -> {
	            System.out.println(pessoas.get(idade));
	        });

	}

}
