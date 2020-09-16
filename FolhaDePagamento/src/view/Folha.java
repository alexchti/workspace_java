package view;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class Folha {

	public static void main(String[] args) {
		Funcionario chf1, com1, hor1, emp1;
		
		chf1 = new Chefe("Alberto Soares", 00123321, 2000.0f, 15.0f, 350f);
		com1 = new Comissionado("Julia Mendes", 1001202, 1850.0f, 25.0f);
		hor1 = new Horista("Amelia da Hora", 12398, 70.0f, 50);
	    emp1 = new Empreiteiro("Joaquim Flores", 12300, 2750);
		
		
		chf1.calcularSalario();
		com1.calcularSalario();
		hor1.calcularSalario();
		emp1.calcularSalario();

	}

}
