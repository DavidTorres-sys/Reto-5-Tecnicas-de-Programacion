package Pokedex;

import java.util.Scanner;

public class Pokebola {
  Scanner entrada = new Scanner(System.in);

  //ATRIBUTOS
  private int tamañoPokebola;
  private String tipoPokemon;

  int input = entrada.nextInt();

  //CONSTRUCTOR

  public Pokebola(int tamañoPokebola, String tipoPokemon) {
    this.tamañoPokebola = tamañoPokebola;
    this.tipoPokemon = tipoPokemon;
  }

  //GET AND SET
  public int getTamañoPokebola(){
    return this.tamañoPokebola;
  }
  public void setTamañoPokebola(){
    int input = entrada.nextInt();
    System.out.println("Ingrese el tamaño de la Pokebola (Grande, Mediana, Pequeña) que desea lanzar");
    if(input == 1){
      System.out.println("Pokebola Grande");
    }
    if(input == 2){
      System.out.println("Pokebola Mediana");
    }
    if(input == 3){
      System.out.println("Pokebola Pequeña");
    }
    else {
      System.out.println("Ingrese un valor valido!");
    }
    this.tamañoPokebola = entrada.nextInt();
  }

  public String tipoPokemon(){
    return this.tipoPokemon;
  }
  public void setTipoPokemon(){
    System.out.println("Ingrese que tipo pokemon desea guardar en la pokebola");
    this.tipoPokemon = entrada.nextLine();
  }
}
