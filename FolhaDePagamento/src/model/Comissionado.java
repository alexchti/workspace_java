package model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}


	@Override
	public void calcularSalario() {
		// Comissionado = salario Base + salarioBase * comissao / 100
		float salario;
		
		salario = this.salarioBase + (this.salarioBase * this.comissao /100);
		System.out.println("Salario (COMI.) " + super.nome + "(" + super.numeroRegistro + ") = " + salario);
	}
	
	
	
}
