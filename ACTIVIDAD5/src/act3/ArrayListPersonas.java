package act3;

import java.util.ArrayList;
public class ArrayListPersonas
{
    public static void main(String[] args)
    {
        ArrayList<Persona>ListaPersonas = new ArrayList<>();
        ListaPersonas.add(new Persona("mateo", 12345678));
        ListaPersonas.add(new Persona("andres", 23456789));
        ListaPersonas.add(new Persona("leon", 34567891));
        for (Persona i : ListaPersonas)
        {
            System.out.println(i);
        }
    }
}