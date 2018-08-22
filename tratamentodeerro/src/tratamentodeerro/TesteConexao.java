package tratamentodeerro;

public class TesteConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Conexao conexao = new Conexao()){
			
			conexao.leDados();
		}catch (IllegalStateException e) {
			System.out.println("Deu erro na coxão!");
		}
		
		
		
		
	////////////////////////////////////////////////////////////////////////////////////////////
		
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//			
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Deu erro na conexão!");
//		}finally {
//			
//			conexao.close();
//		}
		
		
	}

}
