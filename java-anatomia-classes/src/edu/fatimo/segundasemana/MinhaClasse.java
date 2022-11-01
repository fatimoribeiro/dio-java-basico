package edu.fatimo.segundasemana;
public class MinhaClasse {
    public static void main(String [] args) {
        // variavel toda em maiuscula "indica" que se usa denominação de constante, logo, "final"
        final String BR = "Brasil";

        String meuNome = "Fatimo";
        int anoFabricacao = 2022;
        boolean verdadeira = false;

        anoFabricacao = 2018;

        String nomeCompleto = nomeCompleto("Fátimo", "Ribeiro");

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
