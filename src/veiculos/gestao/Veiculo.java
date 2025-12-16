package veiculos.gestao;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    void acelerar(){
        System.out.println("Acelerando carro!");
    }
     void frear(){
        System.out.println("Freando carro!");
    }
}
