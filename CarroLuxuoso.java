package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{

	public CarroLuxuoso(String placa) {
		super(placa);
	}
	
	@Override
	public Posicao getPosicao() {
		return new Posicao(-3.160000 + (-2.960000 - (-3.160000)) * new Random().nextDouble(),
				-60.120000 + (-59.820000 - (-60.120000)) * new Random().nextDouble(),
				15.0 + (100.0 - (15.0)) * new Random().nextDouble());
	}

	@Override
	public double getErroLocalizacao() {
		return 15.0;
	}
}
