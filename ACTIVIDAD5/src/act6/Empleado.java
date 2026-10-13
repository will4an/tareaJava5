package act6;

class Empleado
{
    private String nombre;
    private String apellido;
    private int dni;
    private float sueldo;
    public Empleado(String nombre, String apellido, int dni, float sueldo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    public void setApellido(String Apellido)
    {
        this.apellido = Apellido;
    }
    
    public int getDni()
    {
        return this.dni;
    }
    public void setDni(int Dni)
    {
        this.dni = Dni;
    }
    
    public float getSueldo()
    {
        return this.sueldo;
    }
    public void setSueldo(float Sueldo)
    {
        this.sueldo = Sueldo;
    }
    
    @Override
    public String toString()
    {
        return "EMPLEADO: Nombre y apellido: " + nombre + apellido + " / Dni: " + dni + " / Sueldo: " + sueldo;
    }
}