package act2;

import java.util.LinkedList;
import java.util.Scanner;

public class GestorNombres
{
    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();
        Scanner teclado = new Scanner(System.in);
        
        while(true) 
        {
            System.out.println("1.Agregar 2.Eliminar");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            if(opcion == 1) 
            {
                System.out.print("Ingrese nombre a agregar: ");
                String nombre = teclado.nextLine();
                nombres.add(nombre);
            } 
            else if(opcion == 2) 
            {
                if(nombres.size() != 0) 
                {
                    nombres.removeFirst();
                } 
                else 
                {
                    System.out.println("La lista está vacía!");
                }
            } 
            else {
                System.out.println("No es una opción válida!");
            }

            if (nombres.size() == 0) 
            {
                System.out.println("fila vacia");
            } 
            else 
            {
                for(String nombre : nombres) 
                {
                    System.out.println(nombre + " ");
                }
            }
        }
    }
}