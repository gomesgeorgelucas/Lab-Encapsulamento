package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		var localizaveis = new Localizavel[2];
		localizaveis[0] = new Celular(10, 55, 88888888);
		localizaveis[1] = new CarroLuxuoso("ICOMP-666");
		
		for (int i = 0; i < localizaveis.length; i++) {
			System.out.println(localizaveis[i].getPosicao());
		}

	}

}
