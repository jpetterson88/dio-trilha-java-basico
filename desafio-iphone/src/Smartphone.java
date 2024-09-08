import aparelho.Iphone;

public class Smartphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        // funcoes de reproducao musical
        iphone.selecionarMusica("Welcome to the Jungle - Guns N' Roses");
        iphone.tocar();
        iphone.pausar();

        // funcoes de navegacao na internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me/");
        iphone.atualizarPagina();

        // funcoes de Aparelho telefonico
        iphone.ligar("1212344567");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
