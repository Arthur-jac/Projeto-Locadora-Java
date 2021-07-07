package controllers;

import java.util.ArrayList;
import models.Carro;

public interface ICarro {
	ArrayList<Carro> MostrarCarros();
	Carro buscarPlaca(String placa);
	Carro buscarModelo(String modelo);
	boolean cadastrarCarro(Carro carro);
}
