
public class time {

	public static void main(String[] args) {
		hora t1, t2, t3;
		String horaUniversal, horaPadrao;
		
		t1 = new hora();
		t2 = new hora();
		t3 = new hora();

		t1.setTime(12, 00, 00);
		
		horaUniversal = t1.HoraUniversal();
		System.out.println("Hora Universal: " + horaUniversal);
		
		horaPadrao = t1.HoraPadrao();
		System.out.println("Hora Universal: " + horaPadrao);
	}

}
