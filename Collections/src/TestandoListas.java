import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <String> s = new ArrayList();
		
		s.add("Java");
		s.add("SQL");
		s.add("C#");
		Collections.sort(s);

		System.out.println(s);
		
		s.remove(1);
		
//		for (String string : s) {
//			System.out.println(string);
//		}
		
		System.out.println(s);
		
		System.out.println("O nome do primeiro objeto é: "+ s.get(0));
		
	}

}
