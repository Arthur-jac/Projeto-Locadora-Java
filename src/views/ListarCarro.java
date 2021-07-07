package views;

import controllers.CarroController;
import models.Carro;

public class ListarCarro {	
	public static void ListarCarros() {
		CarroController controllerCar = new CarroController();
		
		System.out.println("\n **** LISTAGEM DE CARROS **** \n");
		for (Carro carroCad : controllerCar.MostrarCarros()) {
			System.out.println(carroCad);
		}
	}
}
