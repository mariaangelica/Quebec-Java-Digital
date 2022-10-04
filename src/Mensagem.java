public class Mensagem {

    public static void obterMensagem (int hora){
       if(hora >= 5 && hora < 13)
            mensagemBomDia();
       else if (hora > 12 && hora < 18)
            mensagemBoaTarde();
            else if(hora <0 || hora > 23)
                    System.out.println("\nHORA INVÁLIDA");
                    else mensagemBoaNoite();
    }
    public static void mensagemBomDia(){
        System.out.println("\nBom dia!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("\nBoa tarde!!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("\nBoa noite!!!");
    }

    public static void main(String[] args) {
        int hora1 = 3;
        int hora2 = 15;
        int hora3 = -1;
        int hora4 = 8;

        Mensagem.obterMensagem(hora1);
        Mensagem.obterMensagem(hora2);
        Mensagem.obterMensagem(hora3);
        Mensagem.obterMensagem(hora4);
    }
}
