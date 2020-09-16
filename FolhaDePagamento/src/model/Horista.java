package model;

public class Horista extends Funcionario {
	private float valorHora;
	private int numeroHoras;
	
	
	public Horista(String nome, int numeroRegistro, float valorHora, int numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}


	@Override
	public void calcularSalario() {
		// Horista = valor Hora * numero Horas
		
		float salario;
		
		salario = this.valorHora * this.numeroHoras;
		System.out.println("Salario (HORI.) " + super.nome + "(" + super.numeroRegistro + ") = " + salario);
	}
	
	
}
