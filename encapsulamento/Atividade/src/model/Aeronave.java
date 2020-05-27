package model;

public class Aeronave {
	private String nome;
	private boolean temAsas;
	private int passageiro;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isTemAsas() {
		return temAsas;
	}
	public void setTemAsas(boolean temAsas) {
		this.temAsas = temAsas;
	}
	public int getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}
	public void voar() {
		System.out.println("A aeronave " + getNome() +" esta voando");
	}
	public void pousar() {
		System.out.println("A aereonave " + getNome() +" estara pousando em breve");
	}
	public void desembarque() {
		System.out.println("Os passageiros do voo " + getNome() + " est�o desenbarcando");
	}
	
}
