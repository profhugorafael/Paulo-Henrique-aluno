class Livro {
	private String titulo;
	private String autor;
	private short ano;
	private String codigo;
	private boolean disponibilidade;
	
	
	public Livro( String titulo,String aut, String cod, short ano) {
		this.titulo = titulo;
		autor = aut;
		codigo = cod;
		this.ano = ano;
	}
	
	
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getCodigo() {
		return codigo;
	}
	public short getAno() {
		return ano;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	
	
	public String toString ( ) {
		return "O nome do Livro eh "
				+ titulo;
				
	}
}




public class Main {
	public static void main(String[] args) {
		
		
		Livro geografia = new Livro("Geobrasil","aurelio","222", (short)19);
		
		geografia.setDisponibilidade(true);
		System.out.println(geografia);
		
		
		
	}
}
