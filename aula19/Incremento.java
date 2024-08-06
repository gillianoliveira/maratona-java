package aula19;

public class Incremento {
    public static void main(String[] args) {
        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        System.out.println(); //pula linha

        int contador2 = 0;
        ++contador2;
        System.out.println(contador2);
        --contador2;
        System.out.println(contador2);
    }

}
