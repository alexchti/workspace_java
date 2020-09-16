
public class hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public String HoraUniversal() {
		String horario = "", HorarioMin, HorarioSegundo;
		horario = this.hora + ":" + this.minuto + ":" + this.segundo;
		return horario;
	}
	
	public String HoraPadrao() {
		String horario = "";
		int hInt;
		
		if (this.hora < 12) {
			horario = this.hora + ":" + this.minuto + ":" + this.segundo + " AM";
		} else {
			hInt = this.hora - 12;
			horario = hInt + ":" + this.minuto + ":" + this.segundo + " PM";
		}
		return horario;
	}
}
