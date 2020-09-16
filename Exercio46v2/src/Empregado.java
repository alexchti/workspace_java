
public class Empregado {

	private String nome;
	private String cargo;
	private double salario;
	
	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void imprimir() {
		System.out.println("Nome:    "+nome);
		System.out.println("Cargo:   "+cargo);
	//	System.out.println("Salario: "+salario);
		System.out.printf("Salario: R$ %.2f\n", salario);
		System.out.printf("IMPOSTO: R$ %.2f\n", calcularImposto());
		System.out.println("-----------------------------");
	}
	
	void String folhaPagamento(){
		
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}
	
	double calcularImposto() {
		// salario <= 2.000                 => 0
		// 2.000 < salario <= 4.500   		=> 10% 
		// 4.500 < salario                  => 1200.0
		double imposto;
		
		if (salario <= 2000) {
			imposto = 0;
		} else if (salario <= 4500) {
			imposto = salario * 0.1;
		} else {
			imposto = 1200;
		}
		
		return imposto;
	}
}
