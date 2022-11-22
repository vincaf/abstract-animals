package org.abstracts.animals;

public class Passerotto extends Animale implements IVolante {

	public Passerotto(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");

	}

	@Override
	public void verso() {
		System.out.println("cip");

	}

	@Override
	public void mangia() {
		System.out.println("frutta grattuggiata");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
