package modelVeiculos;

import java.util.Scanner;

public class Veiculos{
	private String freios;
	private String cor;
	private Double velocidade;
	public String getFreios() {
		return freios;
	}
	public void setFreios(String freios) {
		this.freios = freios;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void derrapagem() {
		System.out.println("Os veiculos tem o freio " + getFreios());
	}
	public void velo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual � a velocidade do carro ao fazer a curva?");
		double frenagem = in.nextDouble();
		if(frenagem <= 70) {
			System.out.println("Acelerando com sucesso");
		}else if (frenagem >= 70 && frenagem <= 100) {
			System.out.println("Seu carro esta reduzindo");
		}
		else {
			System.out.println("Velocidade de momento " + frenagem + "km");
			System.out.println("Seu carro capotou n�o deu tempo de freia");
		}
	}
}
