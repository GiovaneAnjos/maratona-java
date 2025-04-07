package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Giovane";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
//        funcionario.salario1 = 2500.00;
//        funcionario.salario2 = 3000.00;
//        funcionario.salario3 = 3000.00;

        funcionario.imprime();
//        funcionario.imprimeMediaSalario();
//        funcionario.mediaSalarios();

    }
}
