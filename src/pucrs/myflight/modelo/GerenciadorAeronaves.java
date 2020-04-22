package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas(){
        int tamanho = aeronaves.size();
        ArrayList<Aeronave> aux;
        for(int i=0;i<tamanho;i++){
            aux = aeronaves.get(i);
            return aux;
        }
        return null;
    }

    public Aeronave buscarPorCodigo(String cod){
        for(Aeronave a: aeronaves){
            if(a.getCodigo() == cod)
            return a;
        }
        return null;
    }

    public String toString() {
        String aux = "\nAeronaves\n- - - - - - - - - - -\n";
        for (Aeronave a : aeronaves) {
            aux = aux + a.toString() + "\n";
        }
        return aux;
    }

}
