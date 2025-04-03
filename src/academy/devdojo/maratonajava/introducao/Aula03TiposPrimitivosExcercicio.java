package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/
public class Aula03TiposPrimitivosExcercicio {
    public static void main(String[] args) {
        String nome = "Giovane";
        String endereco = "Avenida Curitiba, 508";
        double salario = 2500.01;
        String data = "03/04/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", " +
                "confirmo que recebi o salário de " + salario + ", na data " + data + ".";

        System.out.println(relatorio);

        /*
        Exercício 1 - Convenções de variáveis
        Crie variáveis para armazenar as seguintes informações de um campeão do League of Legends:

        - Nome do campeão (ex: "Yasuo")
        - Quantidade de vida (ex: 575)
        - Dano de ataque base (ex: 60.0)
        - Se é um campeão corpo a corpo ou à distância (ex: true para corpo a corpo, false para à distância)

        Siga as convenções de nomes de variáveis do Java. Depois, imprima essas informações no console.
        */
        String campeao = "Yasuo";
        int vida = 575;
        double dano = 60.0;
        boolean corpo = true;
        String resumo = "\n[Campeão: " + campeao + "] [Quantidade de vida: " + vida + "] [Dano de ataque base: " + dano + "] [É corpo a corpo?: " + corpo + "]";
        System.out.println(resumo);

        /*
        Exercício 2 - Declaração e tamanho em memória
        Escreva um programa que declare uma variável para cada tipo primitivo do Java (byte, short, int, long, float, double, char, boolean).

        - Inicialize essas variáveis com valores válidos.
        - Use o método System.out.println() para imprimir o nome da variável, seu valor e o número de bytes que ela ocupa na memória (utilizando Byte.SIZE / 8).
        */
        byte vByte = 10;
        short vShort = 100;
        int vInt = 1000;
        long vLong = 10000;
        float vFloat = 100000;
        double vDouble = 1000000;
        char vChar = 'A';
        boolean vBoolean = true;
        System.out.println("\nNome da variável: vByte | Valor: " + vByte + " | Bytes em memória: " + (Byte.SIZE / 8));
        System.out.println("Nome da variável: vShort | Valor: " + vShort + " | Bytes em memória: " + (Short.SIZE / 8));
        System.out.println("Nome da variável: vInt | Valor: " + vInt + " | Bytes em memória: " + (Integer.SIZE / 8));
        System.out.println("Nome da variável: vLong | Valor: " + vLong + " | Bytes em memória: " + (Long.SIZE / 8));
        System.out.println("Nome da variável: vFloat | Valor: " + vFloat + " | Bytes em memória: " + (Float.SIZE / 8));
        System.out.println("Nome da variável: vDouble | Valor: " + vDouble + " | Bytes em memória: " + (Double.SIZE / 8));
        System.out.println("Nome da variável: vChar | Valor: " + vChar + " | Bytes em memória: " + (Character.SIZE / 8));
        System.out.println("Nome da variável: vBoolean | Valor: " + vBoolean + " | Bytes em memória: Não aplicável.");
        /*
        Exercício 3 - Casting
        Imagine que um campeão do LoL ganha ouro ao abater tropas. O ouro é representado como um número double. Faça um programa que:

        - Declare um double ouroTotal = 3599.75;
        - Converta esse valor para um int e imprima o resultado (o que aconteceu com os centavos?)
        - Converta o int de volta para double e imprima o resultado (o valor mudou?)
        */
        double ouroTotal = 3599.75;
        int ouroTotalInt = (int) ouroTotal;
        System.out.println("\nValor convertido para int: " + ouroTotalInt);

        double ouroTotalDouble = ouroTotalInt;
        System.out.println("Valor convertido de int para double: " + ouroTotalDouble);
        /*

        Exercício 4 - Trabalhando com Strings
        Escreva um programa que:

        - Crie uma variável String chamada nomeCampeao e atribua o nome de um campeão (ex: "Ahri").
        - Use o método length() para imprimir o número de caracteres desse nome.
        - Use toUpperCase() e toLowerCase() para exibir o nome do campeão em maiúsculas e minúsculas.
        - Verifique se o nome do campeão começa com a letra "A" usando o método startsWith().
        */
        String nomeCampeao = "Ahri";

        System.out.println("\n" + nomeCampeao.length());
        System.out.println(nomeCampeao.toUpperCase());
        System.out.println(nomeCampeao.toLowerCase());
        System.out.println(nomeCampeao.startsWith("A"));
        /*
        Exercício 5 - Misturando tudo
        Crie um programa que simula um dano causado por um campeão do LoL.

        - Declare uma variável int danoBase = 70;
        - Declare uma variável double multiplicador = 1.25;
        - Converta o dano base para double, multiplique pelo multiplicador e armazene o resultado em uma variável double danoFinal.
        - Converta danoFinal de volta para int e imprima o resultado.
        */
        int danoBase = 70;
        double multiplicador = 1.25;
        double danoFinal = ((double) danoBase) * multiplicador;
        int danoFinalInt = (int) danoFinal;

        System.out.println("\nO dano final é " + danoFinalInt + ".");

    }
}
