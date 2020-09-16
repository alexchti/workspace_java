
public class Carro {

	// Definição de Atributos (ou seja, estrutura)
	String modelo;
	String marca;
	int ano;
	int finalPlaca;
	String cor;
	String combustivel;
	float preco;
	
	// Definição de Métodos (ou seja, as funcionalidades da classe)
	void exibirAnuncio() {
		System.out.println("*** OFERTA IMPERDIVEL ***");
		System.out.println("Ano: " + ano + "   Final da Placa: " + finalPlaca);
		System.out.println("");
	}
	
}
