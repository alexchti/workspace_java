
public class Carro {

	// Defini��o de Atributos (ou seja, estrutura)
	String modelo;
	String marca;
	int ano;
	int finalPlaca;
	String cor;
	String combustivel;
	float preco;
	
	// Defini��o de M�todos (ou seja, as funcionalidades da classe)
	void exibirAnuncio() {
		System.out.println("*** OFERTA IMPERDIVEL ***");
		System.out.println("Ano: " + ano + "   Final da Placa: " + finalPlaca);
		System.out.println("");
	}
	
}
