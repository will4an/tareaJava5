package act7;

class Moto extends Vehiculo
{
    private int Cilindrada;
    public Moto(String patente, String marca, int kms, int cilindrada)
    {
        super(patente, marca, kms);
        this.Cilindrada = cilindrada;
    }
    public int getCilindrada()
    {
        return this.Cilindrada;
    }
    public void setCilindrada(int cilindrada)
    {
        this.Cilindrada = cilindrada;
    }
    @Override
    public String toString()
    {
        return "MOTO: Patente: " +getPatente()+ " / Marca: " +getMarca()+ " / Kms: " + getKms()+ " / Cilindrada: " +Cilindrada+ "cc";
    }
}