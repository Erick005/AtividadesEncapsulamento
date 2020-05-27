package model;

public class Cachorro extends Mamifero{
	private String porte;
	private String tipo;
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void larir() {
		System.out.println("O cachorro " + getNome() + " esta latindo");
	}
}
