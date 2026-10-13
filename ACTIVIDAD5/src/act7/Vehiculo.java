package act7;

class Vehiculo
{
    private String Patente;
    private String Marca;
    private int Kms;
    public Vehiculo(String patente, String marca, int kms)
    {
        this.Patente = patente;
        this.Marca = marca;
        this.Kms = kms;
    }
    public String getPatente()
    {
        return this.Patente;
    }
    public void setPatente(String patente)
    {
        this.Patente = patente;
    }
    
    public String getMarca()
    {
        return this.Marca;
    }
    public void setMarca(String marca)
    {
        this.Marca = marca;
    }
    
    public int getKms()
    {
        return this.Kms;
    }
    public void setKms(int kms)
    {
        this.Kms = kms;
    }
    
    @Override
    public String toString()
    {
        return "Vehiculo...";
    }
}
