package command;

public class Main {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("Nome1", "250");
		Pedido p2 = new Pedido("Nome1", "150");
		Pedido p3 = new Pedido("Nome1", "10");
		Pedido p4 = new Pedido("Nome1", "500");
		Pedido p5 = new Pedido("Nome1", "1000");
		
		FilaDeComandos filaDeComandos = new FilaDeComandos();
		filaDeComandos.adiciona(new PagaPedido(p1));
		filaDeComandos.adiciona(new FinalizaPedido(p2));
		filaDeComandos.adiciona(new FinalizaPedido(p3));
		filaDeComandos.adiciona(new FinalizaPedido(p4));
		filaDeComandos.adiciona(new ProcessaPedido(p5));
		
		filaDeComandos.executa();
		
	}
	
	//Encapsula uma ação (comando) que vai ser executada no futuro.
	//Excelente para resolver problemas em que há uma fila de trabalho com diferentes ações, 
	//que serão executadas em diferentes momentos no futuro (no formato de fila).
	
	//*Esse comportamento lembra as callback functions (guarda um comportamento que vai ser executado no futuro)
}
