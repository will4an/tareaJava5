package act4;

import java.util.ArrayList;
public class ArrayListAlumnos
{
    public static void main(String[] args)
    {
        ArrayList<Alumno>Clase = new ArrayList<>();
        Clase.add(new Alumno("mateo", 8, 2));
        Clase.add(new Alumno("leon", 10, 2));
        Clase.add(new Alumno("andres", 5, 2));
        for(Alumno indice : Clase)
        {
            System.out.println(indice);
            System.out.println(indice.getPromedio());
        }
    }
}