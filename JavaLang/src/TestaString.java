
public class TestaString {

	public static void main(String[] args) {
		String s = " FJ11  ";
		String s2 = s.replaceAll("1", "2");
		
		System.out.println(s.trim());
		System.out.println(s2);
		
		int i = s.length();
		System.out.println(i);
	}

}
