package controllers;

import java.util.ArrayList;
import models.Carro;

public class CarroController implements ICarro{
	
	private static ArrayList<Carro> carros = new ArrayList<Carro>();
	
	@Override
	public ArrayList<Carro> MostrarCarros(){
		return carros;
	}
	
	@Override
	public Carro buscarPlaca(String placa) {
		for (Carro carroCad : carros) {
			if(carroCad.getPlaca().equals(placa)) {
				return carroCad;
			}
		}
		return null;
	}
	
	@Override
	public Carro buscarModelo(String modelo) {
		for(Carro modeloEn : carros) {
			if(modeloEn.getModelo().equals(modelo)) {
				return modeloEn;
			}
		}
		return null;
	}
	
	@Override
	public boolean cadastrarCarro(Carro carro) {
		if (buscarPlaca(carro.getPlaca()) == null) {
			carros.add(carro);
			return true;
		}
		return false;
	}
}
