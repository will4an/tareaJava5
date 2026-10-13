package act7;

import java.util.LinkedList;
public class Concesionaria
{
    public static void main(String[] args)
    {
        LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
        listaVehiculos.add(new Auto("AA111AA", "Toyota", 200000, 5));
        listaVehiculos.add(new Moto("AA222BB", "Chevrolet", 350000, 200));
        listaVehiculos.add(new Auto("AA333CC", "Peugeout", 40000, 5));
        listaVehiculos.add(new Moto("AA444DD", "Yamaha", 150000, 150));
        for(Vehiculo vehiculo : listaVehiculos)
        {
            System.out.println(vehiculo);
        }
    }
}
