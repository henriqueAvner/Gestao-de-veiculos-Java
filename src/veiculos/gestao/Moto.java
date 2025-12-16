package veiculos.gestao;

public class Moto extends Veiculo{
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
}
