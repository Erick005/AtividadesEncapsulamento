package main;

import model.Eletrodomestico;

public class EletrodomesticoMain {

	public static void main(String[] args) {
		Eletrodomestico moveis = new Eletrodomestico();
		
		moveis.setFogao("Fog�o");
		moveis.setGeladeira("Geladeira");
		moveis.setMesa("Mesa");
		
		moveis.fogao();
		moveis.cozinha();
	}

}
