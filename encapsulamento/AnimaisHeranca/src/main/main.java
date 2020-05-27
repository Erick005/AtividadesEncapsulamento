package main;

import model.Cachorro;
import model.Gato;

public class main {

	public static void main(String[] args) {
		Cachorro viraLata = new Cachorro();
		
		viraLata.setNome("doguinho");
		viraLata.setMama(false);
		viraLata.setFocinho(true);
		viraLata.setPorte("medio");
		
		viraLata.andar();
		viraLata.larir();
		viraLata.fazerBarulho();
		
		System.out.println("\n-------------------------------------\n");
		
		Gato ruby = new Gato();
		
		ruby.setNome("linda");
		ruby.setMama(true);
		ruby.setBigode(true);
		ruby.setFocinho(true);
		
		ruby.andar();
		ruby.miar();
		ruby.fazerBarulho();
	}

}
