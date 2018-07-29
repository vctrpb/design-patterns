package command;

public class ProcessaPedido implements Comando{

	private Pedido pedido;

	public ProcessaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void excuta() {
		System.out.println("Processando pedido " +pedido.getNomeCliente());
		pedido.paga();
	}

	
}
