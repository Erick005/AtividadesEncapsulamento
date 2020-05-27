package main;

import modelVeiculos.Veiculos;
import modelVeiculos.carro;
import modelVeiculos.moto;

public class VeiculosMain {

	public static void main(String[] args) {
		carro fiat = new carro();
		
		fiat.setMarca("Fiat");
		fiat.setPortas(4);
		fiat.setRodas("Liga leve");
		fiat.setVolante("volante");
		
		fiat.peças();
		
		moto honda = new moto();
		
		honda.setBanco("Couro");
		honda.setGuidao("curvado");
		honda.setCor("Vermelho");
		honda.setFreios("Brembo");
		
		honda.correr();
		honda.derrapagem();
		
		Veiculos novos = new Veiculos();
		novos.setCor("Vemelhor");
		novos.setFreios("Brembo");
		
		novos.derrapagem();
		novos.velo();
		
		
	}

}
