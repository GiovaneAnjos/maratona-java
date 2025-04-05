package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();   //Objeto 1
        Carro carro2 = new Carro();  //Objeto 2

        carro.nome = "Honda";
        carro.modelo = "Civic";      //Inicialização do Objeto 1
        carro.ano = 2016;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Jetta";     //Inicialização do Objeto 2
        carro2.ano = 2025;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);


    }
}
