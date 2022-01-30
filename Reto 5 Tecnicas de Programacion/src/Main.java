import Pokedex.*;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner Entrada = new Scanner(System.in);
    int option;
    do {
      System.out.println("1. Evolucionar Pokemon");
      System.out.println("2. Creación");
      System.out.println("3. Crear Pokebolas");
      System.out.print("Ingrese que desea ver: ");
      option = Entrada.nextInt();
    } while (option < 1 || option > 4);

    switch (option) {
      case 1:

        break;

      case 2:
        int opcion;
        do {
          System.out.println("1. Crear Pokemon");
          System.out.println("2. Crear Pokebolas");
          System.out.print("Ingrese que desea ver: ");
          opcion = Entrada.nextInt();
        } while (opcion < 1 || opcion > 2);
        switch (opcion) {
          case 1:
            int poke;
            do {
              System.out.println("1. Crear Pikachu");
              System.out.println("2. Crear Pokedex.Raichu");
              System.out.println("3. Crear Charmander");
              System.out.println("4. Crear Charmeleon");
              System.out.println("5. Crear Charizard");
              System.out.println("6. Crear Squirtle");
              System.out.println("7. Crear Wartortle");
              System.out.println("8. Crear Blastoise");
              System.out.print("Que pokemon desea crear: ");
              poke = Entrada.nextInt();
            } while (poke < 1 || poke > 8);
            switch (poke) {
              case 1:
                System.out.println("has creado un Pikachu!");
                Pikachu pikachu = new Pikachu();
                pikachu.pokemon();
                pikachu.gritar();
                break;
              case 2:
                System.out.println("has creado un Pokedex.Raichu!");
                Raichu raichu = new Raichu();
                raichu.pokemon();
                raichu.gritar();
                break;
              case 3:
                System.out.println("has creado un Charmander!");
                Charmander charmander = new Charmander();
                charmander.pokemon();
                charmander.gritar();
                break;
              case 4:
                System.out.println("has creado un Charmeleon!");
                Charmeleon charmeleon= new Charmeleon();
                charmeleon.pokemon();
                charmeleon.gritar();
                break;
              case 5:
                System.out.println("has creado un Charizard!");
                Charizard charizard = new Charizard();
                charizard.pokemon();
                charizard.gritar();
                break;
              case 6:
                System.out.println("has creado un Squirtle!");
                Squirtle squirtle = new Squirtle();
                squirtle.pokemon();
                squirtle.gritar();
                break;
              case 7:
                System.out.println("has creado un Wartortle!");
                Wartortle wartortle =new Wartortle();
                wartortle.pokemon();
                wartortle.gritar();
                break;
              case 8:
                System.out.println("has creado un Blastoise!");
                Blastoise blastoise = new Blastoise();
                blastoise.pokemon();
                blastoise.gritar();
                break;
            }
            break;
          case 2:
            int pokebola;
            do {
              System.out.println("1. Crear Pokebola pequeña");
              System.out.println("2. Crear Pokebola mediana");
              System.out.println("3. Crear Pokebola grande");
              System.out.print("Que pokebola desea crear: ");
              pokebola = Entrada.nextInt();
            } while (pokebola < 1 || pokebola > 3);
            switch (pokebola) {
              case 1:
                System.out.println("has creado una Pokebola pequeña!");
                break;
              case 2:
                System.out.println("has creado una Pokebola mediana!");
                break;
              case 3:
                System.out.println("has creado una Pokebola grande!");
                break;
            }
        }
        break;
      case 3:
    }
  }
}
