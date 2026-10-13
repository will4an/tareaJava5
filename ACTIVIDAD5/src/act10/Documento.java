package act10;

class Documento 
{
	private String titulo;
	private int paginas;
	public Documento(String Titulo, int Paginas)
	{
		this.titulo = Titulo;
		this.paginas = Paginas;
	}
	
	@Override
	public String toString()
	{
		return "Titulo: " + titulo + " | Paginas: " + paginas;
	}
}
