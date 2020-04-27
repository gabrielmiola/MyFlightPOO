package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {
    private final ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void adicionar(final Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodas(){
        return voos;
    }

    public Voo buscarPorData(final LocalDateTime data){
        for(final Voo a: voos){
            if(a.getDatahora() == data)
            return a;
        }
        return null;
    }

    public String toString() {
        String aux = "\nVoos\n- - - - - - - - - - -\n";
        for (Voo a : voos) {
            aux = aux + a.toString() + "\n";
        }
        return aux;
    }
}
