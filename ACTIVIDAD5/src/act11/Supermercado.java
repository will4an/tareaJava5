package act11;

import java.util.LinkedList;
import java.util.Scanner;

public class Supermercado 
{
	public static void main(String[] args) {
		LinkedList<Cliente> filaClientes= new LinkedList<>();
		Scanner teclado = new Scanner(System.in);
		while(true)
		{
			System.out.println(" ---Menu--- \n 1.Añadir \n 2.Atender \n 3.Listar \n ----------");
			System.out.print(" Opcion: ");
			int opcion = teclado.nextInt();
			teclado.nextLine();
			System.out.println();
			if (opcion == 1)
			{
				System.out.print("Ingresa el nombre: ");
		        String Titulo = teclado.nextLine(); 
		        
		        System.out.print("Ingresa el # del carrito: ");
		        int Paginas = teclado.nextInt(); 
				filaClientes.add(new Cliente(Titulo, Paginas));
				System.out.println();
			}
			else if (opcion == 2) {
				if(filaClientes.size() == 0)
				{
					System.out.println("Nadie que atender!");
				}
				else
				{
					System.out.println("Persona atendida!");
					filaClientes.remove(0);
				}
				System.out.println();
			}
			else if (opcion == 3) {
				if(filaClientes.size() == 0)
				{
					System.out.println("Sin clientes en la fila!");
				}
				else
				{
					for(Cliente cliente : filaClientes)
					{
						System.out.println(cliente);
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println("No es una opcion valida!");
			}
			System.out.println();
		}
	}
}
