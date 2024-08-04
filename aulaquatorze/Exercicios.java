package aulaquatorze;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
* Exercício 1
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
 */
public class Exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dateScanner = LocalDate.now();

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextFloat();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoje = dateScanner.format(dataFormatada);

        String mensagem = String.format("Eu %s, morando no endereço %s, confirmo que recebi o salário de %.2f, na data %s.", nome, endereco, salario, hoje);
        System.out.println(mensagem);

        scanner.close();

    }
}
