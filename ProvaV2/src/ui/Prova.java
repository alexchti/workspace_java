package ui;
// http://www.professorisidro.com.br/wp-content/uploads/Exercicios-Heranca.pdf <<<UniversiPI>>> página 5


import java.util.Scanner;
//import javax.swing.JOptionPane;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		QuestaoSimples lista[];
		lista = new QuestaoSimples[5];
		String resp;
		boolean resultado;

		lista[0] = new QuestaoComDica("Quem ganhou o Sub 20 da 2a divisão do Paulista 2019", "XV de Jaú", "XXé o time favorito do professor Isidoro");
		lista[1] = new QuestaoMultiplaEscolha("Qual a cor do cavalo Branco de Napoleao?", "d", "a) Preto", "b) Marrom", "c) Rosa", "d) Branco", "e) NDA");
		lista[2] = new QuestaoSimples("Qual a formula da água?", "H2O");
		lista[3] = new QuestaoSimples("Quanto vale 1+1?", "2");
		lista[4] = new QuestaoSimples("Quem descobriu o Brasa?", "PA Cabral");
		
//		lista[x] = new QuestaoSimples(enunciado, resposta);
//		lista[x] = new QuestaoMultiplaEscolha(enunciado, resposta, alternativa1, alternativa2, alternativa3, alternativa4, alternativa5);
//		lista[x] = new QuestaoComDica(enunciado, resposta, dica);
				
		for (QuestaoSimples q : lista) {

			System.out.println(q.aplicarQuestao());
			// vou ler a resposta do usuario
			resp = teclado.nextLine();
			
//			resp = JOptionPane.showInputDialog(q.aplicarQuestao());
			resultado = q.corrigir(resp);
			if (resultado) {
			//	JOptionPane.showMessageDialog(null,"ACERTOU!");
				System.out.println("ACERTOU - parabéns");
			} else {
			//	JOptionPane.showMessageDialog(null, "ERROU");
				System.out.println("ERRRROOOOUUUWWW...");
			}

		}
		teclado.close();
	}
}