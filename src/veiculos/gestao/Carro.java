package veiculos.gestao;

public class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;


    public Carro(String marca, int ano, String modelo, int numeroPortas) {
        super(marca, ano, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    void acelerar() {
        System.out.println("Carro acelerando suavemente");
    }

    @Override
    void frear() {
        super.frear();
    }

    @Override
    double calculaCustoViagem(double distanciaKm) {
        return distanciaKm * 0.50;
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção de 4 pneus e óleo";
    }

}
