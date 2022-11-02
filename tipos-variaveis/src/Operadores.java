public class Operadores {
    public static void main(String[] args) {
        // 1
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        
        // 2
        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // 3
        int numero = 5;
        System.out.println(-numero);    // => -5
        System.out.println(numero);     // =>  5
        numero = - numero;
        System.out.println(numero);     // => -5
        numero = + numero;
        System.out.println(numero);     // => -5
        numero = numero * -1;
        System.out.println(numero);     // =>  5

        // 4
        int numeroDois = 5;
        numeroDois = numeroDois + 2;
        System.out.println(numeroDois); // => 7

        numeroDois++;
        System.out.println(numeroDois);     // => 8
        System.out.println(numeroDois++);   // => 8
        System.out.println(numeroDois);     // => 9 [incremento de 1 unidade]
        System.out.println(++numeroDois);   // => 10
        System.out.println(numeroDois--);   // => 10 [não imprime com o decremento]
        System.out.println(numeroDois);     // => 9  [imprime valor decrementado pela instrução acima]
        System.out.println(--numeroDois);   // => 8  [drecrementa o valor primeiro e depois o imprime]

        boolean variavel = true;
        System.out.println(!variavel);      // => false [imprime a negação da variavel sem alterar o seu valor]

        variavel = !variavel;               // altera o valor da variavel, de true para false ou de false para true
        System.out.println(variavel);       // => true

        // 5 - Operador ternario: <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
        int a, b;

        a = 5;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        // EXEMPLO DE CONDICIONAL UTILIZANDO OPERADOR TERNARIO
        String resultadoString = a==b ? "verdadeiro" : "falso"; // variavel String
        System.out.println(resultadoString);

        int resultadoInt = a==b ? 1 : 0; // variavel Int
        System.out.println(resultadoInt);

        // 6 - Relacionais
        int numero1 = 1;
        int numero2 = 2;
        
        // exemplo sem IF
        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        // exemplos com IF
        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
        
        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");
        
        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");
        
        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        // observação: para objetos, a melhor forma de comparação é utilizar a função EQUALS
        String nomeUm = "Fatimo";
        String nomeDois = "Fatimo";
        System.out.println(nomeUm == nomeDois); // => resultado é true

        String nomeTres = new String("Fatimo");
        System.out.println(nomeUm == nomeTres); // => por nomeTres ser instanciado como OBJETO, o resultado é false

        System.out.println(nomeUm.equals(nomeTres)); // => resultado é true

        // 7 - operadores condicionais
        boolean condicaoUm = true;
        boolean condicaoDois = false;

        // bloco dentro da condição não é executado devido ao operador &&
        if (condicaoUm && condicaoDois)
            System.out.println("As duas condições são verdadeiras");

        // bloco dentro da condição é executado devido ao operador ||
        if (condicaoUm || condicaoDois)
            System.out.println("Uma das condições é verdadeira");
    }    
}
