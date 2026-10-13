package act13;

class Producto {
	private int codigo;
	private double precio;
	public Producto(int Codigo, double Precio)
	{
		this.codigo = Codigo;
		this.precio = Precio;
	}
	public int getCodigo()
	{
		return codigo;
	}
	public void setCodigo(int Codigo)
	{
		this.codigo = Codigo;
	}
	
	public double getPrecio()
	{
		return precio;
	}
	public void setPrecio(double Precio)
	{
		this.precio = Precio;
	}
	
	@Override
	public String toString()
	{
		return "Producto codigo: " + codigo + " / Precio: " + precio;
	}
}
