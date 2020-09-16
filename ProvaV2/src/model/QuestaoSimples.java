package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples (String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta  = resposta;
	}
	
	public String aplicarQuestao() {
		return "Questao: "+enunciado+"?";
	}
	
	public boolean corrigir(String respAluno) {
		return this.resposta.equals(respAluno);
	}

}
