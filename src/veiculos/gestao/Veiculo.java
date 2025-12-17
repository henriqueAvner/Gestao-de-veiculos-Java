package veiculos.gestao;

public abstract class Veiculo {
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
    double calculaCustoViagem(double distanciaKm){return 0.0;}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if(ano < java.time.Year.now().getValue()) {
            System.out.println("Manutenção já realizada");
        } else if (ano > java.time.Year.now().getValue()) {
            System.out.println("Manutenção não pode ser de uma data futura");
            System.out.println("Alterando para data atual...");
            this.ano = java.time.Year.now().getValue();
        }
    }


}
