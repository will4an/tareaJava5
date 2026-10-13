package act14;

import java.util.LinkedList;
import java.util.Scanner;
public class Colectivo 
{
    public static void main(String[] args) {
        LinkedList<Pasajero> pasajeros = new LinkedList<>();
        Scanner teclado = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1.Subir \n2.Bajar \n3.Mostrar");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) 
            {
                System.out.println("Ingresa el nombre del pasajero:");
                String nombre = teclado.nextLine();
                System.out.println("Ingresa el DNI del pasajero:");
                int dni = teclado.nextInt();
                
                pasajeros.add(new Pasajero(nombre, dni));
            } 
            else if (opcion == 2)
            {
                if (pasajeros.size() == 0) 
                {
                	System.out.println("El colectivo está vacío!");
                } 
                else 
                {
                	pasajeros.removeFirst();
                }
            } 
            else if (opcion == 3) 
            {
                if (pasajeros.size() == 0) 
                {
                	System.out.println("El colectivo está vacío!");
                }
                else 
                {
                    for (int i = 0; i < pasajeros.size(); i++)
                    {
                        System.out.println((i + 1) + ". " + pasajeros.get(i));
                    }
                }
            }
            else
            {
                System.out.println("Opción no válida.");
            }
        }
    }
}
