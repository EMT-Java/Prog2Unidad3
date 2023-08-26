package consola;

import java.util.Scanner;

import logica.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		Alumno a=new Alumno();  //cree el objeto Alumno
		Fecha fecha1=new Fecha();
		Alumno b=new Alumno("Ruiz","2",2000,fecha1);
		
		Alumno c=new Alumno("Diaz","3",1000,new Fecha(23,12,2010));
				
		a.setApellido("Perez");
		a.setGrupo("4");
		a.setCuota(1000);
		a.setNacimiento(fecha1);
		
		System.out.println("El alumno a es:"+a.toString());
		System.out.println("El alumno b queda: "+b.toString());
		System.out.println("c:"+c.toString());
		
		
	}

}
