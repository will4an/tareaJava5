package act6;

class Gerente extends Empleado
{
    private String departamento;
    public Gerente(String nombre, String apellido, int dni, float sueldo, String departamento)
    {
        super(nombre, apellido, dni, sueldo);
        this.departamento = departamento;
    }
    public String getDepartamento() 
    {
        return departamento;
    }

    public void setDepartamento(String departamento) 
    {
        this.departamento = departamento;
    }
    
    @Override
    public String toString()
    {
        return "GERENTE: Nombre y apellido: " + getNombre() + " " + getApellido() + " / Dni: " + getDni() + " / Sueldo: " + getSueldo() + " / Departamento: " + departamento;
    }
}
