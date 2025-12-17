package veiculos.gestao;

public class Moto extends Veiculo implements Manutencao{
    private int cilindrada;

    public Moto(String marca, int ano, String modelo, int cilindrada) {
        super(marca, ano, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    void acelerar() {
        System.out.println("Moto acelerando rapidamente com rugido");
    }

    @Override
    void frear() {
        super.frear();
    }

    @Override
    double calculaCustoViagem(double distanciaKm) {
        return distanciaKm * 0.25;
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção de 2 pneus e lanterna dianteira";
    }
}
