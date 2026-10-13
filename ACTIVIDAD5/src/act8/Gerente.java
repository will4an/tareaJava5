package act8;

class Gerente extends Empleado
{
    private String departamento;
    
    public Gerente(String nombre, String apellido, float sueldo, String Departamento)
    {
        super(nombre, apellido, sueldo);
        this.departamento = Departamento;
    }
    public String getDepartamento()
    {
        return departamento;
    }
    public void setDepartamento(String Departamento)
    {
        this.departamento = Departamento;
    }
    
    @Override
    public String toString()
    {
        return "GERENTE " + departamento;
    }
}

