
public class TestesThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable tarefa = new ImprimeString();
		Runnable tarefa2 = new ImprimeString();
		Thread thread =new Thread(tarefa);
		Thread thread2 =new Thread(tarefa2);
		
		thread.start();
		thread2.start();

	}

}
