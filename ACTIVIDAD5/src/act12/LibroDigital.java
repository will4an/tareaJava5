package act12;

class LibroDigital extends Libro
{
	private double tamano;
	public LibroDigital(String Nombre, int Paginas, double Tamano)
	{
		super(Nombre, Paginas);
		this.tamano = Tamano;
	}
	public double getTamano()
	{
		return tamano;
	}
	public void setTamano(double Tamano)
	{
		this.tamano = Tamano;
	}
	
	@Override
	public String toString()
	{
		return "LIBRO DIGITAL, nombre: " + getNombre() + " paginas: " + getPaginas() + " Tamano: " + tamano;
	}
}
