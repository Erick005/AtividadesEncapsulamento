package main;

import model.cachorro;

public class main {

	public static void main(String[] args) {
		cachorro viraLata = new cachorro();
		
		viraLata.setNome("Doguinho");
		viraLata.setCorPelo("Vermelho");
		viraLata.setMama(true);
		viraLata.setFocinho(true);
		viraLata.setPorte("Grande");
		viraLata.setTipo("Fazenda");
		
		viraLata.andar();
		viraLata.latir();
		viraLata.fazerBarulho();
	}

}
