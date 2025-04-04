package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        //categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

        //Se a nota for menor que 5, o aluno está na "categoria Reprovado".
        //Se a nota for entre 5 (inclusive) e 7 (exclusivo), o aluno está na "categoria Recuperação".
        //Se a nota for 7 ou maior, o aluno está na "categoria Aprovado".
        int nota = 5;
        String resultado;
        if (nota < 0){
            resultado = "\nValor inválido!";
        }else if (nota < 5) {
            resultado = "\nestá reprovado"+ ", sua nota foi: " + nota;
        } else if (nota >= 5 && nota < 7) {
            resultado = "\nestá em recuperação"+ ", sua nota foi: " + nota;
        } else {
            resultado = "\nestá aprovado"+ ", sua nota foi: " + nota;
        }
        System.out.println(resultado);
    }

}

