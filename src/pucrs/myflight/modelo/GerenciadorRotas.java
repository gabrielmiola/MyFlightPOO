package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
	
	public GerenciadorRotas() {
		rotas = new ArrayList<>();
    }
    
    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public Rota buscarPorOrigem(Aeroporto orig){
        for(Rota a: rotas){
            if(a.getOrigem() == orig)
            return a;
        }
        return null;
    }

    public String toString() {
        String aux = "\nRotas\n- - - - - - - - - - -\n";
        for (Rota a : rotas) {
            aux = aux + a.toString() + "\n";
        }
        return aux;
    }
}
