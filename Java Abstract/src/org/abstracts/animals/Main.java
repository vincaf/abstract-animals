package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		
		Cane c = new Cane("Cane");
		System.out.println("Animale: " + c.getNome());
		c.dormi();
		c.mangia();
		c.verso();
		
		System.out.println("\n----------\n");
		
		Passerotto p = new Passerotto("Passerotto");
		System.out.println("Animale: " + p.getNome());
		p.dormi();
		p.mangia();
		p.verso();
		
		System.out.println("\n----------\n");
		
		Aquila a = new Aquila("Aquila");
		System.out.println("Animale: " + a.getNome());
		a.dormi();
		a.mangia();
		a.verso();
		
		System.out.println("\n----------\n");
		
		Delfino d = new Delfino("Delfino");
		System.out.println("Animale: " + d.getNome());
		d.dormi();
		d.mangia();
		d.verso();
		
		System.out.println("\n----------\n");
		
		System.out.print(a.getNome() + ": ");
		faiVolare(a);
		
		System.out.print(d.getNome() + ": ");
		faiNuotare(d);
		
		System.out.print(p.getNome() + ": ");
		faiVolare(p);
		
	}
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

}
