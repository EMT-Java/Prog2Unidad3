package logica;

public class Alumno {
	
	private String apellido;
	private String grupo;
	private float cuota;
	private Fecha nacimiento;

	
	public Alumno() {
		cuota=1000;
		//nacimiento=new Fecha(1,1,2020);
	}
	
	public Alumno(String ape,String gru, float cuo, Fecha nac) {
		apellido=ape;
		grupo=gru;	
		cuota=cuo;
		nacimiento=nac;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public String getGrupo() {
		return grupo;
	}	
	
	public float getCuota() { 
		return cuota;
	}
	
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public void setCuota(float cuota) {
		this.cuota = cuota;
	}
	
	public Fecha getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [apellido=" + apellido + ", grupo=" + grupo + ", cuota=" + cuota +", Fecha: "+ nacimiento.toString()+"]";
	}


	
	
		
}
