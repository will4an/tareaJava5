package act11;

class Cliente 
{
	private String nombre;
	private int carrito;
	public Cliente(String Nombre, int Carrito)
	{
		this.nombre = Nombre;
		this.carrito = Carrito;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + nombre + " | Carrito #" + carrito;
	}
}
