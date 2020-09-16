package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	
	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}


	@Override
	public void calcularSalario() {
		// Empreiteiro = valor Empreita 
		float salario;
		
		salario = this.valorEmpreita;
		System.out.println("Salario (EMPR.) " + super.nome + "(" + super.numeroRegistro + ") = " + salario);
	} 
	
	
}
