package logica;

public class Alumno1 {
	private String apellido;
	private String grupo;
	private float cuota;
	
	public Alumno1(String apellido, String grupo, float cuota) {
		super();
		this.apellido = apellido;
		this.grupo = grupo;
		this.cuota = cuota;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public float getCuota() {
		return cuota;
	}

	public void setCuota(float cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Alumno1 [apellido=" + apellido + ", grupo=" + grupo + ", cuota=" + cuota + "]";
	}
	
	
	
	
}
