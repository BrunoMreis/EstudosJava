package br.com.alura.servidor;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThread implements ThreadFactory {
	private static int  numero = 1;
	
	@Override
	public Thread newThread(Runnable tarefa) {
		
		Thread thread = new Thread(tarefa, "Thread Servidor Tarefas " + numero);
		
		numero++;
		
		thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
		thread.setDaemon(true);
		
		return thread;
	}

}
