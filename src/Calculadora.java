public class Calculadora {

    public static void somar (double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("A soma de " + num1 +" mais " + num2 + " é igual a: " + resultado);
    }

    public static void subtrair (double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " e " + num2 + " é igual a: " + resultado);
    }

    public static void multiplicar (double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " vezes " + num2 + " é igual a: " + resultado);
    }

    public static void dividir (double num1, double num2){
        double resultado = num1/num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é igual a: " + resultado);
    }

    public static void main(String[] args) {
        double a = Math.random();  //testes
        double b = Math.random();  //testes

        System.out.println("a = " + a + " b = " + b);

        Calculadora.somar(a,b);
        Calculadora.subtrair(a,b);
        Calculadora.multiplicar(a,b);
        Calculadora.dividir(a,b);

        System.out.println("Fim da execução");
    }
}

