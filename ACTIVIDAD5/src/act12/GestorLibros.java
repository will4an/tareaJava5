package act12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class GestorLibros {

	public static void main(String[] args) {
		ArrayList<Libro> Inventario = new ArrayList<>();
		LinkedList<Libro> Prestamos = new LinkedList<>();
		Scanner teclado = new Scanner(System.in);
		Inventario.add(new LibroDigital("PruebaDigital", 300, 30.3));
		Inventario.add(new LibroFisico("PruebaFisica", 300, "La Nacion"));
		while(true)
		{
			System.out.println("1.Agregar Libro \n2.Pedir \n3.Devolver \n4.Mostrar Inventario \n5.Mostrar Prestados");
			int opcion = teclado.nextInt();
			teclado.nextLine();
			if (opcion == 1)
			{
				System.out.println("1.Fisico \n2.Digital");
				opcion = teclado.nextInt();
				teclado.nextLine();
				if (opcion == 1) {
                    System.out.println("Ingresa: nombre");
                    String nombre = teclado.nextLine();
                    
                    System.out.println("Ingresa: paginas");
                    int paginas = teclado.nextInt();
                    teclado.nextLine();
                    
                    System.out.println("Ingresa: editorial");
                    String editorial = teclado.nextLine();
                    Inventario.add(new LibroFisico(nombre, paginas, editorial));
                }
                else if (opcion == 2) {
                    System.out.println("Ingresa: nombre");
                    String nombre = teclado.nextLine();
                    
                    System.out.println("Ingresa: paginas");
                    int paginas = teclado.nextInt();
                    
                    System.out.println("Ingresa: tamano");
                    double tamano = teclado.nextDouble();
                    Inventario.add(new LibroDigital(nombre, paginas, tamano));
                }
				else
				{
					System.out.println("No es una opcion valida!");
				}
			}
			else if(opcion == 2)
			{
				for(int indice = 0; indice < Inventario.size() ; indice++)
				{
					System.out.println("Libro #"+ indice+" ; " + Inventario.get(indice));
				}
				System.out.println("Elegi el indice del libro a pedir");
				opcion = teclado.nextInt();
				if(opcion >= 0 && opcion < Inventario.size())
				{
					Prestamos.add(Inventario.get(opcion));
				}
				else
				{
					System.out.println("Opcion Invalida!");
				}
			}
			else if(opcion == 3)
			{
				Prestamos.removeFirst();
			}
			else if(opcion == 4)
			{
				if(Inventario.size() == 0)
				{
					System.out.println("No hay inventario!");
				}
				System.out.println("INVENTARIO: ");
				for(Libro libro : Inventario)
				{
					System.out.println(libro);
				}
			}
			else if(opcion == 5)
			{
				if(Prestamos.size() == 0)
				{
					System.out.println("No hay prestamos!");
				}
				System.out.println("PRESTAMOS: ");
				for(Libro libro : Prestamos)
				{
					System.out.println(libro);
				}
			}
			else
			{
				System.out.println("No es una opcion valida!");
			}
		}
	}
}
