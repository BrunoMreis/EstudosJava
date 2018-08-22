package experimento;

import java.lang.Thread.UncaughtExceptionHandler;

public class TratadorDeExecoes implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Ocorreu um erro: "+ t.getName() + e.getMessage());

	}

}
