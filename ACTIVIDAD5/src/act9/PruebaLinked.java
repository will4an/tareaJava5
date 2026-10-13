package act9;

import java.util.LinkedList;
public class PruebaLinked
{
    public static void main(String[] args)
    {
    	long inicio = System.nanoTime();
        LinkedList<Persona> listaPersonas = new LinkedList<>();
        
        System.out.println("asignando");
        for (int i = 0; i < 100000; i++)
        {
            listaPersonas.add(new Persona("Humano", i));
        }
        
        System.out.println("empezando");
        for (int i = 0; i < 100000; i++)
        {
            listaPersonas.remove(0);
        }

        long fin = System.nanoTime();
        System.out.println("termino");
        System.out.println("Tiempo: " + (fin - inicio) / 1_000_000.0 + " ms");
    }
}
