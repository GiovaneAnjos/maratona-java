package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int i = 0; i < 1000000; i += 2) {
            System.out.println("For " + i);
        }
        // Resolução da aula
        // Por quê do IF?: caso o int i = 0 seja modificado, continuará contando os pares.
        // No exemplo acima, caso seja modificado, contará os ímpares.
        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("For " + i);
            }
        }
    }
}
