package aula19;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        double bonus = 1000;
        bonus = 2000 + 1000;  //Hard coded
        System.out.println(bonus);

        double bonus2 = 1000;
        bonus2 += 1000;
        bonus2 -= 1000;
        bonus2 *= 1000;
        bonus2 /= 1000;
        System.out.println(bonus2);
    }
}
