package userInterface;

import core.Conta;


public class bank {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.setNomeTitular("Maria das Dores");
		conta.setCpf("111.222.333-44");
		conta.setNumeroConta(1001);
		
		System.out.println("Nome:            " + conta.getNomeTitular());
		System.out.println("CPF:             " + conta.getCpf());
		System.out.println("Numero da conta: " + conta.getNumeroConta());
		System.out.println("Saldo:           " + conta.getSaldo());
		System.out.println();
		
		System.out.println(">>> CREDITAR 10");
		conta.creditar(10);
		System.out.println("Saldo (+10):     " + conta.getSaldo());
		System.out.println();
		
		System.out.println(">>> CREDITAR 15");
		conta.creditar(15);
		System.out.println("Saldo (+15):     " + conta.getSaldo());
		System.out.println();
		
		System.out.println(">>> DEBITAR 7");
		if (conta.debitar(7)) {
			System.out.println("Debito realizado com sucesso!");
		} else {
			System.out.println("Erro ao debitar valor / SEM SALDO SUFICIENTE!");
		}
		System.out.println("Saldo (-7):      " + conta.getSaldo());
		
		System.out.println(">>> DEBITAR 17");
		if (conta.debitar(17)) {
			System.out.println("Debito realizado com sucesso!");
		} else {
			System.out.println("Erro ao debitar valor / SEM SALDO SUFICIENTE!");
		}
		System.out.println("Saldo (-17):      " + conta.getSaldo());
	}
	
	
}
