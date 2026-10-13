package act1;

import java.util.ArrayList;
import java.util.Scanner;
public class GestorNombres {

	public static void main(String[] args) {
		ArrayList<String> Nombres = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Agregar 2.Mostrar");
			int opcion = teclado.nextInt();
            teclado.nextLine();
			if(opcion == 1)
			{
				System.out.println("Ingrese nombre a agregar: ");
				String nombre = teclado.nextLine();
				Nombres.add(nombre);
			}
			else if(opcion == 2)
			{
				for(String nombre : Nombres)
				{
					System.out.print(nombre);
				}
			}
			else
			{
				System.out.println("No es una opcion valida!");
			}
			teclado.nextLine();
		}
	}

}
