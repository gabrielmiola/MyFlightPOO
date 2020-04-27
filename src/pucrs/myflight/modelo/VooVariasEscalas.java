package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends VooEscalas{
    private ArrayList<Rota> rotas;
    private Rota rota;

    public VooVariasEscalas (LocalDateTime datahora){
        super (datahora);
        rotas = new ArrayList<Rota>();
    }

    public boolean addRota(Rota escala){
        return rotas.add(escala);
    }

    public Rota getRota(){
        return rota;
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }
    
    @Override
    public String toString(){
        String rotasStr = "";
        for(Rota escala: rotas) rotasStr = rotasStr + " " + escala;

        return super.toString() + "Escalas: " + rotasStr;
    }
}