package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
Crie uma classe Funcionario com os seguintes atributos:
nome, idade salario (três salários devem ser guardados)
1. Para imprimir os dados
2. Para tirar a média dos salários e imprimir o resultado
*/

//Comentários minha forma
public class Funcionario {
    public String nome;
    public int idade;
    public double salarios[];
    //public double salario1, salario2, salario3;

    public void imprime() {
        System.out.println("--------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }
//        System.out.println(this.salario1);
//        System.out.println(this.salario2);
//        System.out.println(this.salario3);

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia salarial " + media);
    }

//    public void mediaSalarios() {
//        double media = (salario1 + salario2 + salario3) / 3;
//        System.out.println("Média dos salários: " + media);
//    }
}