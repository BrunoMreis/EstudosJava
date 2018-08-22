
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta();
		
		
		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			System.out.println("Tratamento....");
		}
		

	}

}
