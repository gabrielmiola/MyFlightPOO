package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeronave> listarTodas(){
        return null;
    }

    public Aeroporto buscarPorCodigo(String cod){
        for(Aeroporto a: aeroportos){
            if(a.getCodigo() == cod)
            return a;
        }
        return null;
    }
}
