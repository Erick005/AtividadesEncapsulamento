package model;

public class Eletrodomestico {
	private String fogao;
	private String geladeira;
	private String mesa;
	public String getFogao() {
		return fogao;
	}
	public void setFogao(String fogao) {
		this.fogao = fogao;
	}
	public String getGeladeira() {
		return geladeira;
	}
	public void setGeladeira(String geladeira) {
		this.geladeira = geladeira;
	}
	public String getMesa() {
		return mesa;
	}
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	public void fogao() {
		System.out.println("O fog�o esta aceso");
	}
	public void cozinha () {
		System.out.println("A cozinha tem os seguintes moveis " + getFogao() + ", " + getGeladeira() + " e " + getMesa() + " todos est�o limpos");
	}
}
