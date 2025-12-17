package veiculos.gestao;

import java.util.List;

public class Garagem {
    private List<Veiculo> veiculoList;

    public Garagem(){};

    void adicionarVeiculo(Veiculo veiculo) {
        veiculoList.add(veiculo);
   }

   void iniciarTodos(){
       for(Veiculo currVeicle : veiculoList) {
            currVeicle.acelerar();
       }
   }
}
