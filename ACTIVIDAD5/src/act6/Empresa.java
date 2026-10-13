package act6;

import java.util.ArrayList;
public class Empresa
{
    public static void main(String[] args)
    {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Mateo", "Dening", 300, 48123456));
        listaEmpleados.add(new Gerente("Gonzalo", "Lazarte", 800, 49234567, "ventas"));
        listaEmpleados.add(new Empleado("Andres", "Moroni", 400, 49345678));
        listaEmpleados.add(new Gerente("Leon", "Morales", 600, 48456789, "finanzas"));
        for(Empleado Empleado : listaEmpleados)
        {
            System.out.println(Empleado);
        }
    }
}