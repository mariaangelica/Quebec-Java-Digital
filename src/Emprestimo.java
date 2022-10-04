public class Emprestimo {

    public static int parcelar2Vezes(){
        return 2;
    }

    public static int parcelar3Vezes(){
        return 3;
    }

    public static int parcelar4Vezes(){
        return 4;
    }

    public static double taxar2Parcelas(){
        return 0.3;
    }

    public static double taxar3Parcelas(){
        return 0.45;
    }

    public static double taxar4Parcelas(){
        return 0.67;
    }

    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * taxar2Parcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
    }   else if (parcelas == 3){
            double valorFinal = valor + (valor * taxar3Parcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else if (parcelas == 4) {
            double valorFinal = valor + (valor * taxar4Parcelas());
            System.out.println("Valor final do empréstimo para 4 parcelas: R$ " + valorFinal);
        }   else System.out.println("\nNúmero de parcelas inválido");
    }

    public static void main(String[] args) {
        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.parcelar2Vezes());
        Emprestimo.calcular(1000, Emprestimo.parcelar3Vezes());
        Emprestimo.calcular(1000, Emprestimo.parcelar4Vezes());
        Emprestimo.calcular(1000, 5);
    }
}