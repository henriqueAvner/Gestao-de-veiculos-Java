package veiculos.gestao;

public class Carro extends Veiculo {
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
}
