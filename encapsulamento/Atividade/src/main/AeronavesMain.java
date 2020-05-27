package main;

import model.Aeronave;

public class AeronavesMain {

	public static void main(String[] args) {
		Aeronave gol = new Aeronave();
		
		gol.setNome("09483");
		gol.setPassageiro(40);
		gol.setTemAsas(true);
		
		gol.voar();
		gol.pousar();
		gol.desembarque();
	}

}
