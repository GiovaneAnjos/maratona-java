package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 10;
        dias[0][1] = 11;
        dias[0][2] = 12;

        dias[1][0] = 13;
        dias[1][1] = 14;
        dias[1][2] = 15;

        dias[2][0] = 16;
        dias[2][1] = 17;
        dias[2][2] = 18;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------");

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
