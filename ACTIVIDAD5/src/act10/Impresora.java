package act10;

import java.util.LinkedList;
import java.util.Scanner;
public class Impresora 
{

	public static void main(String[] args) {
		LinkedList<Documento> listaDocumentos = new LinkedList<>();
		Scanner teclado = new Scanner(System.in);
		while(true)
		{
			System.out.println(" ---Menu--- \n 1.Añadir \n 2.Imprimir \n 3.Listar \n ----------");
			System.out.print(" Opcion: ");
			int opcion = teclado.nextInt();
			teclado.nextLine();
			System.out.println();
			if (opcion == 1)
			{
				System.out.print("Ingresa el titulo: ");
		        String Titulo = teclado.nextLine(); 
		        
		        System.out.print("Ingresa el # de paginas: ");
		        int Paginas = teclado.nextInt(); 
				listaDocumentos.add(new Documento(Titulo, Paginas));
				System.out.println();
			}
			else if (opcion == 2) {
				if(listaDocumentos.size() == 0)
				{
					System.out.println("Nada que imprimir");
				}
				else
				{
					System.out.println("Documento Impreso!");
					listaDocumentos.remove(0);
				}
				System.out.println();
			}
			else if (opcion == 3) {
				if(listaDocumentos.size() == 0)
				{
					System.out.println("Sin documentos en lista");
				}
				else
				{
					for(Documento Documento : listaDocumentos)
					{
						System.out.println("1. "+ Documento);
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println("No es una opcion valida");
			}
			System.out.println();
		}
	}
}
