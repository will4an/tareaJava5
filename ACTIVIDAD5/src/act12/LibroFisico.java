package act12;

class LibroFisico extends Libro
{
	private String editorial;
	public LibroFisico(String Nombre, int Paginas, String Editorial)
	{
		super(Nombre, Paginas);
		this.editorial = Editorial;
	}
	public String getTamano()
	{
		return editorial;
	}
	public void setTamano(String Tamano)
	{
		this.editorial = Tamano;
	}
	
	@Override
	public String toString()
	{
		return "LIBRO FISICO, nombre: " + getNombre() + " paginas: " + getPaginas() + " Editorial: " + editorial;
	}
}
