
public class Livro {
	// Atributos
	private String  titulo;
	private String  autor;
	private int     anoPublicação;
	private String  categoria;
	//posição na biblioteca
	private int     numEstante; 
	private int     numPrateleira;
	private boolean emprestado;
	
	// Construtor
	public Livro(String titulo, String autor, int anoPublicação, String categoria,
			     int numEstante, int numPrateleira) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicação = anoPublicação;
		this.categoria= categoria;
		
		//posição na biblioteca
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

	public int getAnoPublicação() {
		return anoPublicação;
	}

	public void setAnoPublicação(int anoPublicação) {
		this.anoPublicação = anoPublicação;
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

	// Médodos
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
		System.out.println("Ano de Publicação ......: " + anoPublicação);
		System.out.println("Categoria ..............: " + categoria);
		System.out.println("Posição na biblioteca");
		System.out.println("  Numero da Estante ....: " + numEstante);
		System.out.println("  Numero da Prateleira .: " + numPrateleira);
		System.out.println("Situação ...............: " + getEmprestado());
		System.out.println("");
	}
}
