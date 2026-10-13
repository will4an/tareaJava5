package act8;

class Supervisor extends Empleado
{
    private String turno;
    public Supervisor(String nombre, String apellido, float sueldo, String Turno)
    {
        super(nombre, apellido, sueldo);
        this.turno = Turno;
    }
    public String getTurno()
    {
        return turno;
    }
    public void setTurno(String Turno)
    {
        this.turno = Turno;
    }
    
    @Override
    public String toString()
    {
        return "SUPERVISOR " + turno;
    }
}
