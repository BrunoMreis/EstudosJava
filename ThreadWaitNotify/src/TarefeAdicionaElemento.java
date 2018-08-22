
public class TarefeAdicionaElemento implements Runnable {
	
	
	private Lista lista;
	private int numeroDaThread;

	public TarefeAdicionaElemento(Lista lista, int numero) {
        this.lista = lista;
        this.numeroDaThread =  numero;
    }

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			lista.adicionaElementos("Thread " + numeroDaThread + " - " + i);
		}
	}

}
