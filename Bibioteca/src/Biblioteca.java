
public class Biblioteca {

	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro("Anjos e Demonios", "Dan Brown", 2010, "a��o", 1, 20);
		l2 = new Livro("O C�digo da Vinci", "Dan Bronw", 2008, "a��o", 1, 1);
		l3 = new Livro("Fortaleza Digital", "Dan Bronw", 2012, "a��o", 1, 40);
				
		l1.imprime();
		l2.imprime();
		l3.imprime();
		System.out.println(">>>>> EMPRESTAR");
		l1.emprestar();
		l1.imprime();
		System.out.println(">>>>> DEVOLVER");
		l1.devolver();
		l1.imprime();
	}

}
