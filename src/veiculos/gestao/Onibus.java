package veiculos.gestao;

public class Onibus extends Veiculo implements TransportePassageiros{

    public Onibus(String marca, int ano, String modelo) {
        super(marca, ano, modelo);
    }

    @Override
    public boolean embarcarPassageiro(int quantidade) {
        if(quantidade > 0){
            System.out.printf("Embarcando %n passageiros", quantidade);
            return true;
        } else{
            System.out.println("Não existem passageiros a serem embarcados");
            return false;
        }
    }

    @Override
    public String realizarManutencao() {
        return "Realizando manutenção no ônibus ";
    }

    @Override
    void acelerar() {
        System.out.println("Acerelando onibus");
        super.acelerar();
    }

    @Override
    void frear() {
        System.out.println("Freando onibus");
        super.frear();
    }

    @Override
    double calculaCustoViagem(double distanciaKm) {
        System.out.println("Calculando viagem de onibus");
        return super.calculaCustoViagem(distanciaKm);
    }
}
