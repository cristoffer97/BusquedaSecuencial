package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
	// Array para notas con valores puestos
	public static double notas[] = { 8.0, 9, 6,8 };
//Array con valores aleatorios
	public static double notasAleat[] = new double[3];
//Array con interactividad
	public static double notasInter[] = new double[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargarDatosAleatorios();
//CargarDatosInteractividad();
		MostrarDatos();
		System.out.println("La Suma de las notas es: "+MostrarSumaNotas());
		System.out.println("La Media de las notas es: "+MediaNota());
		System.out.println("El numero menor de las notas es "+ NumeroMenor());
		System.out.println("El numero Mayor de las notas es "+ NumeroMayor());
		System.out.println("La Posicion del numero en el array es: "+busquedasecuencial((int) 6.8));
        
        
	}

	public static int busquedasecuencial(int num) {
		// TODO Auto-generated method stub
		int posicion=-1;
		int numero=num;
		for(int i=0; i<notas.length;i++) {
			if(notas[i]==num) {
				
				posicion=i;
				return posicion;
			}
				 
			
		}
		return posicion;
		
		
	}

	public static double NumeroMenor() {
		
		
		
		
		double numchi=notas[0];
		for (int i =0;i<notas.length;i++) {
			if(numchi>notas[i]) {
				numchi=notas[i];
			}
			
			
			
		}
		
		return(numchi);
		
	}
	
	public static double NumeroMayor() {
		
		
		
		
		double nummayor=notas[0];
		for (int i =0;i<notas.length;i++) {
			if(nummayor<notas[i]) {
				nummayor=notas[i];
			}
			
			
			
		}
		
		return(nummayor);
		
	}

	public static double MediaNota() {
		// TODO Auto-generated method stub
		double sum = 0;
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			sum = sum + notas[i];
			media = Math.floor(sum / notas.length);
		}
	//	System.out.println("La media de las notas es" + media);
		return media;
	}

	// Metodo que carga valores aleatorios a notas
	public static void CargarDatosAleatorios() {

		// TODO Auto-generated method stub
		for (int i = 0; i < notasAleat.length; i++) {
			notasAleat[i] = Math.floor(Math.random() * 10);
		}

	}

	// Cargar valores de forma interavtiva
	public static void CargarDatosInteractividad() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < notasInter.length; i++) {
			try {
				System.out.println("Introduce los valores que quieres");
				double Not = sc.nextDouble();
				notasInter[i] = Not;

			} catch (InputMismatchException e) {
				System.out.println("Ha ocurrido un error");
			}

		}
	}

	public static double MostrarSumaNotas() {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < notas.length; i++) {
			sum = sum + notas[i];
		}
		/*System.out.println("La suma de las notas es " + sum);
		System.out.println();
		System.out.println();*/
return sum;
	}

	// Metodo para Mostrar los datos del array
	public static void MostrarDatos() {
		// TODO Auto-generated method stub
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\nArray con valores puestos por defecto: " + notas[i]);
		}
		System.out.println();
		for (int i = 0; i < notasAleat.length; i++) {
			System.out.print("\nArray con valores puestos Aleatorios: " + notasAleat[i]);
		}
		System.out.println();
		for (int i = 0; i < notasInter.length; i++) {
			System.out.print("\nArray con valores puestos por usuario: " + notasInter[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
