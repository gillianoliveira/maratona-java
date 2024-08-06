package aula18;

public class OperadoresLogicosOu {

    public static void main(String[] args) {
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float valorPlaystation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);
    }
}
