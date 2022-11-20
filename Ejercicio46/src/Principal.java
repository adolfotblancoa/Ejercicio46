import java.util.Scanner;
public class Principal{
	public static void main(String []args){
	int a;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un entero: ");
	a = teclado.nextInt();
		if(a>10){
		System.out.println("El numero es mayor que 10.");
		} else if (a<10){
		System.out.println("El numero es menor que 10.");
		}else
			System.out.println("El numero es igual a 10:");

	}



}


