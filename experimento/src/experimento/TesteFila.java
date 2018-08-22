package experimento;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TesteFila {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> fila = new ArrayBlockingQueue<>(3);
		
		fila.put("c1");
		fila.put("c2");
		fila.put("c3");
		boolean foi = fila.offer("c4", 10, TimeUnit.SECONDS);
		System.out.println(foi);
		
		System.out.println(fila.take());
		System.out.println(fila.take());
		System.out.println(fila.take());
		System.out.println(fila.poll(10, TimeUnit.SECONDS));
		
		
		System.out.println(fila.size());
		
	}

}
