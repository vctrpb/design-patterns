package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeComandos {
	
	List<Comando> comandos;
	
	
	public FilaDeComandos() {
		this.comandos = new ArrayList<>();
	}
	
	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}
	
	public void executa() {
		this.comandos.forEach(c -> c.excuta());
	}
}
