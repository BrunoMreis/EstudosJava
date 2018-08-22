package experimento;

import java.io.FileReader;
import java.util.Properties;

public class LeitorDePropriedades implements Runnable {

	private Properties propriedades;
	private String nomeArquivo;

	public LeitorDePropriedades(Properties propriedades, String nomeArquivo) {
        this.propriedades = propriedades;
        this.nomeArquivo = nomeArquivo;
    }

	public void run() {
		try {
			this.propriedades.load(new FileReader(nomeArquivo));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}