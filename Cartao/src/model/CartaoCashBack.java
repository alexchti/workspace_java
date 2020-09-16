package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;
	
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public boolean comprar(double valor, int tipo) {
		super.comprar(valor);
		switch(tipo) {
			case 1:    // "1" BRONZE - +2%
				valor += valor * 0.02;
				break;
			case 2:    // "2" SILVER - +5%
				valor += valor * 0.05;
				break;
			case 3:	   // "3" GOLD - +8%
				valor += valor * 0.08;
				break;
		}
		super.adicionarCredito(valor);
		return true;
	}
}
