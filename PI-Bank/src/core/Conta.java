package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected float saldo;
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void xtoString() {
		System.out.println("<<<em construção>>> xtoString()");
	}
	
	public boolean debitar(float valorDebito) {
		boolean erro = true;
		
		if (saldo - valorDebito >= 0) {
			this.saldo -= valorDebito;
			return true;
		} 
		return false;
	}
	
	public void creditar(float valorCredito) {
		this.saldo += valorCredito;
	}

}
