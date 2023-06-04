package banco;

public class ContaCorrente {
	private String nome;
	private String numeroConta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
		
	
	
	
	
}
