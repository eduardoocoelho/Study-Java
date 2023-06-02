package entities;

public class BankAccount {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public BankAccount(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public BankAccount(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(saldo);
	}

	
	public String getTitular() {
		return titular;
	}
	

	public void setTitular(String titular) {
		this.titular = titular;
	}
	

	public int getNumeroConta() {
		return numeroConta;
	}
	

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor ) {
		saldo -= (valor + 5);
	}
}
