package auladoze;

// Aula sobre casting
public class TiposPrimitivos {
    public static void main(String[] args) {
        // int para byte
        int intValue = 128;
        byte byteValue = (byte) intValue; // byteValue será -128 devido ao overflow

        // int para short
        short shortValue = (short) intValue; // shortValue será -32536 devido ao overflow


        System.out.println(byteValue);
        System.out.println(shortValue);

    }

}


