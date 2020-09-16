// http://www.professorisidro.com.br/wp-content/uploads/Exercicio_Cartao.pdf

package ui;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class admCartao {

	public static void main(String[] args) {
		
		double valor;
		CartaoPrePago cartaoPre = new CartaoPrePago("1001", "Maria das Dores", 2026, 9, 0);
		
		
		System.out.println("Cartão: "+cartaoPre.getNumeroCartao()+
				           " - "+cartaoPre.getNomeTitular()+
				           ", Validade: "+cartaoPre.getAnoValidade()+
				           "/"+cartaoPre.getMesValidade()+
				           ", Saldo: R$ "+cartaoPre.getSaldo());
		
		valor = 1000;
		System.out.println(">>> DEPOSITO DE "+valor);
		cartaoPre.adicionarCredito(valor);
		System.out.println("Cartão: "+cartaoPre.getNumeroCartao()+
							" - "+cartaoPre.getNomeTitular()+
							", Validade: "+cartaoPre.getAnoValidade()+
							"/"+cartaoPre.getMesValidade()+
							", Saldo: R$ "+cartaoPre.getSaldo());
		
		valor = 500;
		System.out.println(">>> DEPOSITO DE "+valor);
		cartaoPre.adicionarCredito(valor);
		System.out.println("Cartão: "+cartaoPre.getNumeroCartao()+
							" - "+cartaoPre.getNomeTitular()+
							", Validade: "+cartaoPre.getAnoValidade()+
							"/"+cartaoPre.getMesValidade()+
							", Saldo: R$ "+cartaoPre.getSaldo());

		valor = 1500;
		System.out.println(">>> COMPRA DE "+valor);
		if (cartaoPre.comprar(valor)) {
			System.out.println(">>> Compra realizada com sucesso");
		} else {
			System.out.println(">>> SEM SALDO SUFICIENTE!!!");
		}
		System.out.println("Cartão: "+cartaoPre.getNumeroCartao()+
							" - "+cartaoPre.getNomeTitular()+
							", Validade: "+cartaoPre.getAnoValidade()+
							"/"+cartaoPre.getMesValidade()+
							", Saldo: R$ "+cartaoPre.getSaldo());
		
		valor = 500;
		System.out.println(">>> COMPRA DE "+valor);
		if (cartaoPre.comprar(valor)) {
			System.out.println(">>> Compra realizada com sucesso");
		} else {
			System.out.println(">>> SEM SALDO SUFICIENTE!!!");
		}
		System.out.println("Cartão: "+cartaoPre.getNumeroCartao()+
							" - "+cartaoPre.getNomeTitular()+
							", Validade: "+cartaoPre.getAnoValidade()+
							"/"+cartaoPre.getMesValidade()+
							", Saldo: R$ "+cartaoPre.getSaldo());
		
		
		System.out.println("=========================================");
		CartaoCashBack cartao = new CartaoCashBack("1001", "Maria das Dores", 2026, 9, 0, 1);
		
		
		System.out.println("Cartão: "+cartao.getNumeroCartao()+
				           " - "+cartao.getNomeTitular()+
				           ", Validade: "+cartao.getAnoValidade()+
				           "/"+cartao.getMesValidade()+
				           " - tipo: "+ cartao.getTipo()+
				           ", Saldo: R$ "+cartao.getSaldo());
		
	}

}
