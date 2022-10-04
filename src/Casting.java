/**
 * Exercícios de fixação sobre casting (conversões) em JAVA
 */

public class Casting {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;   // DOWNCAST -> perda de informação

        long l1;
        int i1 = 10;
        l1 = i1;            // UPCAST --> mais espaço na variável

        int i2;
        long l2 = 1000000000000000000L;   // DOWNCAST -> perda de informação
        i2 = (int) l2;

        int i3;
        long l3 = 100000L;
        i3 = (int)l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;   // DOWNCAST mas não perde informação, poucas casas após o ponto

        f2 = (float) d2;
        double d3 = 100000.5888888888888888888888888888888888888888888888888d;  // DOWNCAST -> perda de informação
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f; // DOWNCAST -> perda de informação (fracionais)
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;  //// DOWNCAST -> perda de informação (maior para menor)

        System.out.println("b1: " + b1);
        int i = 3;
        int novo = 10 - 5 * 2 + --i;
        System.out.println(novo);

    }
}
