package act7;

class Auto extends Vehiculo
{
    private int Puertas;
    public Auto(String patente, String marca, int kms, int puertas)
    {
        super(patente, marca, kms);
        this.Puertas = puertas;
    }
    public int getPuertas()
    {
        return this.Puertas;
    }
    public void setPuertas(int puertas)
    {
        this.Puertas = puertas;
    }
    @Override
    public String toString()
    {
        return "AUTO: Patente: " +getPatente()+ " / Marca: " +getMarca()+ " / Kms: " + getKms()+ " / Puertas: " +Puertas;
    }
}