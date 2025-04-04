package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //salario 0 - 34712 = 9.70%
        //salario 34713 - 68507 = 37.35%
        //salario 68508 = 49.50
        int salary = 70000;
        double tax = 0;
        if (salary <= 34712) {
            tax = 9.70;
        } else if (salary >= 34713 && salary <= 68507) {
            tax = 37.35;
        } else {
            tax = 49.50;
        }
        double taxTotal = (tax / 100) * salary;
        System.out.println("O salário é: $ " + salary + ", a taxa de imposto é: " + tax + "%" + " e o valor do imposto é : " + taxTotal);

        // Resolução da aula
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
