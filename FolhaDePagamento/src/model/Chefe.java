package model;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}


	@Override
	public void calcularSalario() {
		// Chefe: Salario Base + SalarioBase * adicional Funcao/ 100 + beneficio Terno
		float salario;
		salario = this.salarioBase + (this.salarioBase * this.adicionalFuncao / 100) + this.beneficioTerno;
		System.out.println("Salario (CHEFE) " + super.nome + "(" + super.numeroRegistro + ") = " + salario);
	}
	
}
