package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	private String alternativa5;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativa1, String alternativa2,
			String alternativa3, String alternativa4, String alternativa5) {
		super(enunciado, resposta);
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
		this.alternativa5 = alternativa5;
	}
	public String aplicarQuestao() {
		return super.aplicarQuestao()+"\n   "+alternativa1+"\n   "+alternativa2+"\n   "+alternativa3
				                     +"\n   "+alternativa4+"\n   "+alternativa5;
	}
	
}
