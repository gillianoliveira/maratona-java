package aula17;

public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("boolean isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

    }

}
