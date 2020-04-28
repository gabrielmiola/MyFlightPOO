package pucrs.myflight.modelo;
//classe inutil
import java.util.ArrayList;

public class VooVariasEscalas{
    private ArrayList<Rota> rotas;
    private Rota rota;

    public VooVariasEscalas(){
        //super(datahora)
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