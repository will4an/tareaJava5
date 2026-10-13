package act13;

import java.util.ArrayList;
import java.util.Scanner;
public class Gondola {

	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Agregar \n2.Cambiar precio \n3.Mostrar");
			int opcion = teclado.nextInt();
			if(opcion == 1)
			{
				System.out.println("Ingrese el precio: ");
				double precio = teclado.nextDouble();
				productos.add(new Producto(productos.size(), precio));
			}
			else if(opcion == 2)
			{
				for(Producto producto : productos)
				{
					System.out.println(producto);
				}
				System.out.println("Indice del producto para cambiar el precio: ");
				opcion = teclado.nextInt();
				if(opcion >= 0 && opcion < productos.size())
				{
					System.out.println("Ingrese nuevo precio: (precio viejo: " + productos.get(opcion).getPrecio() + ")");
					double precio = teclado.nextDouble();
					productos.get(opcion).setPrecio(precio);
				}
				else
				{
					System.out.println("Opcion Invalida!");
				}
			}
			else if(opcion == 3)
			{
				for(Producto producto : productos)
				{
					System.out.println(producto);
				}
			}
		}
	}

}
