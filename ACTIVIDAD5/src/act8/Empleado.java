package act8;

class Empleado
{
    private String nombre;
    private String apellido;
    private float sueldo;
    public Empleado(String Nombre, String Apellido, float Sueldo)
    {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.sueldo = Sueldo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String Apellido)
    {
        this.apellido = Apellido;
    }
    
    public float getSueldo()
    {
        return sueldo;
    }
    public void setSueldo(float Sueldo)
    {
        this.sueldo = Sueldo;
    }
    
    public String toString()
    {
        return "EMPLEADO " + nombre;
    }
}
