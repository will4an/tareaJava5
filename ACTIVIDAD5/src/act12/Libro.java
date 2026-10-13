package act12;

class Libro {
	private String nombre;
	private int paginas;
	public Libro(String Nombre, int Paginas)
	{
		this.nombre = Nombre;
		this.paginas = Paginas;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String Nombre)
	{
		this.nombre = Nombre;
	}
	
	public int getPaginas()
	{
		return paginas;
	}
	public void setPaginas(int Paginas)
	{
		this.paginas = Paginas;
	}
	
	@Override
	public String toString()
	{
		return "LIBRO, nombre: " + nombre + " paginas: " + paginas;
	}
}
