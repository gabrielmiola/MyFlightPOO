package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo{
    private ArrayList<Rota> rotas;
    private Rota rota;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao){
        super(rota, datahora, duracao);
        rotas = new ArrayList<Rota>();
    }

    public boolean addRotaTeste(Rota escala){
        return rotas.add(escala);
    }

    public void addRota(Rota escala){
        rotas.add(escala);
    }

    public Rota getRota(){
        return rota;
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }

    @Override
    public String toString(){
        return super.toString() + " ->  " + getRota();
    }
}