package modelVeiculos;

public class carro extends Veiculos{
	private String volante;
	private String rodas;
	private String marca;
	private int portas;
	public String getVolante() {
		return volante;
	}
	public void setVolante(String volante) {
		this.volante = volante;
	}
	public String getRodas() {
		return rodas;
	}
	public void setRodas(String rodas) {
		this.rodas = rodas;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void pe�as() {
		System.out.println("O carro da " + getMarca() + " esta com todas pe�as");
	}
}
