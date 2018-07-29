package command;

public class Pedido {
	
	private String nomeCliente;
	private String valor;
	private Status status;

	public Pedido(String nomeCliente, String valor) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}

	public Status getStatus() {
		return status;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void processa() {
		this.status = Status.EM_PROCESSAMENTO;
	}
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		this.status = Status.FINALIZADO;
	}

}
