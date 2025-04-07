package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("----------------------------");

        //estudante.nome = "Gohan"; // O nome dos estudantes 01 e 02 passam a ser Gohan.

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan"; // Imprime normalmente o nome dos estudantes acima, em seguida, antes
                                  // de finalizar o método, altera o nome dos estudantes como Gohan.

    }
}
