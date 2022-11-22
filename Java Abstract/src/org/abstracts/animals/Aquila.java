package org.abstracts.animals;

public class Aquila extends Animale implements IVolante {

	public Aquila(String nome) {
		super(nome);
	}
	
	@Override
	public void dormi() {
		System.out.println("zzz");

	}

	@Override
	public void verso() {
		System.out.println("aaah");

	}

	@Override
	public void mangia() {
		System.out.println("conigli");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}

}
