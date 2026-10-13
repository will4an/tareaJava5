package act5;

import java.util.LinkedList;
import java.util.Scanner;
public class Clinica
{
    public static void main(String[] args)
    {
        LinkedList<Persona> Turnos = new LinkedList<>();
        Scanner teclado = new Scanner(System.in);
        Turnos.add(0, new Persona("mateo", 12345678));
        Turnos.add(0, new Persona("andres", 23456789));
        Turnos.add(0, new Persona("leon", 34567891));
        while(Turnos.size() != 0)
        {
            for(Persona Persona : Turnos)
            {
                System.out.println(Persona.getNombre());
            }
            int Opcion = teclado.nextInt();
            if (Opcion == 1)
            {
                Turnos.removeLast();
            }
        }
        teclado.close();
    }
}