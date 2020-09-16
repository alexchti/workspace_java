
public class Livro {
	// Atributos
	private String  titulo;
	private String  autor;
	private int     anoPublica��o;
	private String  categoria;
	//posi��o na biblioteca
	private int     numEstante; 
	private int     numPrateleira;
	private boolean emprestado;
	
	// Construtor
	public Livro(String titulo, String autor, int anoPublica��o, String categoria,
			     int numEstante, int numPrateleira) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublica��o = anoPublica��o;
		this.categoria= categoria;
		
		//posi��o na biblioteca
		this.numEstante = numEstante; 
		this.numPrateleira = numPrateleira;
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublica��o() {
		return anoPublica��o;
	}

	public void setAnoPublica��o(int anoPublica��o) {
		this.anoPublica��o = anoPublica��o;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	public int getNumPrateleira() {
		return numPrateleira;
	}

	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}

	public String getEmprestado() {
		String resultado;
		
		if (this.emprestado) {
			resultado = "EMPRESTADO";
		} else {
			resultado = "DISPONIVEL";
		}
		return resultado;
	}

	// M�dodos
	public void emprestar() {
		this.emprestado = true;
	}
	
	public void devolver() {
		this.emprestado = false;
	}
	
	public void imprime() {
		System.out.println("==================== Livro ====================");
		System.out.println("Titulo .................: " + titulo);
		System.out.println("Autor ..................: " + autor);
		System.out.println("Ano de Publica��o ......: " + anoPublica��o);
		System.out.println("Categoria ..............: " + categoria);
		System.out.println("Posi��o na biblioteca");
		System.out.println("  Numero da Estante ....: " + numEstante);
		System.out.println("  Numero da Prateleira .: " + numPrateleira);
		System.out.println("Situa��o ...............: " + getEmprestado());
		System.out.println("");
	}
}
