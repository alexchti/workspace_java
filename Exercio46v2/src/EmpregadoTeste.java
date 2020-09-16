
public class EmpregadoTeste {
	public static void main(String args[]) {
		Empregado emp1, emp2, emp3;
		
		emp1 = new Empregado("Mario Sergio", "porteiro", 3000);
		emp2 = new Empregado("Mathias da Silva", "vigia", 5000);
		emp3 = new Empregado("Maria Benedicta", "faxineira", 1500);
		
		System.out.println(">>>>>> ANTES DO AUMENTO <<<<<<");
		emp1.imprimir();		
		emp2.imprimir();
		emp3.imprimir();
		
		emp1.aumentarSalario(5);
		emp2.aumentarSalario(10);
		emp3.aumentarSalario(20);
		
		System.out.println(">>>>>> DEPOIS DO AUMENTO <<<<<<");
		emp1.imprimir();		
		emp2.imprimir();
		emp3.imprimir();
	}
}
