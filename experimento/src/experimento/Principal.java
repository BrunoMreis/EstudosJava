
package experimento;

import java.util.Properties;

public class Principal {

	public static void main(String[] args) {
		Properties properties = new Properties();
		Thread thread = new Thread(new LeitorDePropriedades(properties, "arquivo1.txt"));
		thread.setUncaughtExceptionHandler(new TratadorDeExecoes());
		thread.start();
	}
}
