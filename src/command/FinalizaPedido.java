package command;

public class FinalizaPedido implements Comando{

	private Pedido pedido;

	public FinalizaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void excuta() {
		System.out.println("Finalizando pedido " +pedido.getNomeCliente());
		pedido.finaliza();
	}

}
