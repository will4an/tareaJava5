package act8;

import java.util.ArrayList;
public class Empresa
{
    public static void menu(String[] args)
    {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Supervisor("Leon", "Morales", 670, "Noche"));
        listaEmpleados.add(new Gerente("Mateo", "Dening", 800, "Higiene"));
        listaEmpleados.add(new Supervisor("Andres", "Moroni", 500, "Mañana"));
        listaEmpleados.add(new Gerente("Juan", "Picca", 1500, "Ventas"));
        for(Empleado empleado : listaEmpleados)
        {
           System.out.println(empleado);
        }
    }
}
