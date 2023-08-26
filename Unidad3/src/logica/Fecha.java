package logica;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(){
		
	}
	
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setDia(int dia) {
		this.dia=dia;
	}
	
	public void setMes(int mes) {
		this.mes=mes;
	}
	
	public void setAnio(int anio) {
		this.anio=anio;
	}
	
	

	public String toSrting() {
		//return "\n Dia= " + dia + "\n mes= " + mes + "\n anio= " + anio;
	
		return dia+ "/" + mes+ "/" + anio;
	
		
	}
	
	
	
}

