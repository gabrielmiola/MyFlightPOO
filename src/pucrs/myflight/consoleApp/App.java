package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;

public class App {

	public static void main(String[] args) {
		System.out.println("MyFlight project...");

		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
		Aeronave a1 = new Aeronave ("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave ("73G", "Boeing 737-700", 126);
		Aeronave a3 = new Aeronave ("380", "Airbus Industrie A380", 644);
		Aeronave a4 = new Aeronave ("764", "Boeing 737-400", 304);

		aeronaves.adicionar(a1);
		aeronaves.adicionar(a2);
		aeronaves.adicionar(a3);
		aeronaves.adicionar(a4);

		String cod = "733";
		//System.out.println("Busca pelo codigo da aeronave" + GerenciadorAeronaves.buscaPorCodigo());

		System.out.println("\n\n");

		Geo portoAlegre = new Geo( -30,-51);
		Geo saoPaulo = new Geo( -23,-46);
		Geo lisboa = new Geo( 38,-9);
		Geo miami = new Geo( 25,-80);

		GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
		Aeroporto aero1 = new Aeroporto ("POA","Salgado Filho", portoAlegre);
		Aeroporto aero2 = new Aeroporto ("GRU","Sao Paulo Garulhos", saoPaulo);
		Aeroporto aero3 = new Aeroporto ("LIS","Lisboa", lisboa);
		Aeroporto aero4 = new Aeroporto ("MIA","Miami", miami);

		aeroportos.adicionar(aero1);
		aeroportos.adicionar(aero2);
		aeroportos.adicionar(aero3);
		aeroportos.adicionar(aero4);

		System.out.println("\n\n");

		GerenciadorCias cias = new GerenciadorCias();
		CiaAerea c1 = new CiaAerea ("JJ","LATAM");
		CiaAerea c2 = new CiaAerea ("G3","GOL");
		CiaAerea c3 = new CiaAerea ("TP","TAP");
		CiaAerea c4 = new CiaAerea ("AD", "AZUL");

		cias.adicionar(c1);
		cias.adicionar(c2);
		cias.adicionar(c3);
		cias.adicionar(c4);

		System.out.println("\n\n");
		
		GerenciadorRotas rotas = new GerenciadorRotas();
		Rota r1 = new Rota ( c1, aero1, aero2, a1);
		Rota r2 = new Rota ( c2, aero2, aero3, a2);
		Rota r3 = new Rota ( c3, aero3, aero4, a3);
		Rota r4 = new Rota ( c4, aero4, aero1, a4);

		rotas.adicionar(r1);
		rotas.adicionar(r2);
		rotas.adicionar(r3);
		rotas.adicionar(r4);

		System.out.println("\n\n");

		GerenciadorVoos voos = new GerenciadorVoos();
		

		System.out.println("\n\n");
}
}
