public class Area4os {  //Assinatura = Nome + Parâmetros

    public static void area(double lado) {  // Sobrecarga: Pq se mantem o nome do método, mas muda a lista de
                                            // parâmetros.
                                           //O nome do método é sempre o mesmo, porém em todos os casos os
                                          // parâmetros são diferentes.
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango: " + (diagonal1 * diagonal2)/2);
    }

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Area4os.area(5);
        Area4os.area(5.2d,7d);
        Area4os.area(9,5,3);
        Area4os.area(6f,5f);

    }

}
