package act14;

class Pasajero {
	private String nombre;
	private int dni;
	public Pasajero(String Nombre, int Dni)
	{
		this.nombre = Nombre;
		this.dni = Dni;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String Nombre)
	{
		this.nombre = Nombre;
	}
	
	public int getDni()
	{
		return dni;
	}
	public void setDni(int Dni)
	{
		this.dni = Dni;
	}
	
	@Override
	public String toString()
	{
		return "Pasajero nombre: " + nombre+ " / DNI: " + dni;
	}
}
