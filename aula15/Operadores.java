package aula15;
/*
 * Operadores Aritméticos
 */

public class Operadores {
    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;

        // +
        System.out.println(numero02+numero01);  // soma
        System.out.println("Valor: "+numero02+numero01);  // concatenação
        System.out.println(numero02+numero01+"Valor: "+numero02+numero01);  // concatenação

        // subtração
        System.out.println(numero02-numero01);

         // multiplicação
        System.out.println(numero01 * numero02);

        // divisão
        System.out.println(numero02/numero01);
        System.out.println(numero01/numero02);
    }

}
