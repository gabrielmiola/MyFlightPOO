package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo{
    private Rota rota;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao){
        super(rota, datahora, duracao);
        this.rota = rota;
    }

    public Rota getRota(){
        return rota;
    }

    @Override
    public String toString(){
        return super.toString() + " ->  " + getRota();
    }
}