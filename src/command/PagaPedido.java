package command;

public class PagaPedido implements Comando{

	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void excuta() {
		System.out.println("Pagando pedido " +pedido.getNomeCliente());
		pedido.paga();
	}

}
