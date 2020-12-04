import logica.*;

public class Main {

	public static void main(String[] args) {
		Alumno a=new Alumno();  //cree el objeto Alumno
		Fecha fecha1=new Fecha(12,10,2000);
		Alumno b=new Alumno("Ruiz",2,2000,fecha1);
		
		Alumno c=new Alumno("Diaz",3,1000,new Fecha(23,12,2010));
				
		a.setApellido("Perez");
		a.setGrupo(4);
		a.setCuotaBase(1000);
		a.setNacimiento(fecha1);
		
		System.out.println("El alumno a es:"+a.toString());
		System.out.println("El alumno b queda: "+b.toString());
		if (a.boletoGratis())
			System.out.println("Le corresponde boleto gratis");
		else
			System.out.println("No le corresponde boleto gratis");
		
		
		
	}

}