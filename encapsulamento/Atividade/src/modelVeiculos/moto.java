package modelVeiculos;

public class moto extends Veiculos{
	private String guidao;
	private String banco;
	public String getGuidao() {
		return guidao;
	}
	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public void correr() {
		System.out.println("A moto tem um banco de " + getBanco() + " muito confortavel");
	}
}
