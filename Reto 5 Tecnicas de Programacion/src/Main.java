import Pokedex.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws NoEvolucionaException {

    Scanner Entrada = new Scanner(System.in);
    int option;
    do {
      System.out.println("1. Evolucionar Pokemon");
      System.out.println("2. Creación");
      System.out.print("Ingrese que desea hacer: ");
      option = Entrada.nextInt();
    } while (option < 1 || option > 2);

    switch (option) {
      case 1:
        int evolicionar;
        do {
          System.out.println("1. Evolucionar Pikachu");
          System.out.println("2. Evolucionar Raichu");
          System.out.println("3. Evolucionar Charmander");
          System.out.println("4. Evolucionar Charmeleon");
          System.out.println("5. Evolucionar Charizard");
          System.out.println("6. Evolucionar Squirtle");
          System.out.println("7. Evolucionar Wartortle");
          System.out.println("8. Evolucionar Blastoise");
          System.out.print("Que pokemon desea evolcionar: ");
          evolicionar = Entrada.nextInt();
        } while (evolicionar < 1 || evolicionar > 8);
        switch (evolicionar) {
          case 1:
            System.out.println("Pikachu a evolucionado a Raichu!");
            Pikachu pikachu = new Pikachu();
            pikachu.evolucionar();
            break;
          case 2:
            Raichu raichu = new Raichu();
            raichu.evolucionar();
            break;
          case 3:
            System.out.println("Charmander a evolucionado a Charmeleon!");
            Charmander charmander = new Charmander();
            charmander.evolucionar();
            break;
          case 4:
            System.out.println("Charmeleon a evolucionado a Charizard!");
            Charmeleon charmeleon = new Charmeleon();
            charmeleon.evolucionar();
            break;
          case 5:
            Charizard charizard = new Charizard();
            charizard.evolucionar();
            break;
          case 6:
            System.out.println("Squirtle a evolucionado a Wartortle!");
            Squirtle squirtle = new Squirtle();
            squirtle.evolucionar();
            break;
          case 7:
            System.out.println("Wartortle a evolucionado a Blastoise!");
            Wartortle wartortle = new Wartortle();
            wartortle.evolucionar();
            break;
          case 8:
            Blastoise blastoise = new Blastoise();
            blastoise.evolucionar();
            break;
        }
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
              System.out.println("2. Crear Raichu");
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
                System.out.println("has creado un Raichu!");
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
                Charmeleon charmeleon = new Charmeleon();
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
                Wartortle wartortle = new Wartortle();
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
                Pokebola bola1 = new Pokebola(1, "pokemon");
                System.out.println("has creado una Pokebola pequeña!");
                int guardar;
                do {
                  System.out.println("1. Guardar Pikachu");
                  System.out.println("2. Guardar Charmander");
                  System.out.println("3. Guardar Squirtle");
                  System.out.print("Que pokemon desea guardar: ");
                  guardar = Entrada.nextInt();
                } while (guardar < 1 || guardar > 3);
                switch (guardar) {
                  case 1:
                    System.out.println("has Capturado un Pikachu!");
                    Pikachu pikachu = new Pikachu();
                    pikachu.pokemon();
                    pikachu.gritar();
                    break;
                  case 2:
                    System.out.println("has Capturado un Charmander!");
                    Charmander charmander = new Charmander();
                    charmander.pokemon();
                    charmander.gritar();
                    break;
                  case 3:
                    System.out.println("has creado un Squirtle!");
                    Squirtle squirtle = new Squirtle();
                    squirtle.pokemon();
                    squirtle.gritar();
                    break;
                }
                break;
              case 2:
                Pokebola bola2 = new Pokebola(2, "pokemon");
                System.out.println("has creado una Pokebola mediana!");
                int guardar2;
                do {
                  System.out.println("1. Guardar Raichu");
                  System.out.println("2. Guardar Charmeleon");
                  System.out.println("3. Guardar Wartortle");
                  System.out.print("Que pokemon desea guardar: ");
                  guardar2 = Entrada.nextInt();
                } while (guardar2 < 1 || guardar2 > 3);
                switch (guardar2) {
                  case 1:
                    System.out.println("has Capturado un Raichu!");
                    Raichu raichu = new Raichu();
                    raichu.pokemon();
                    raichu.gritar();
                    break;
                  case 2:
                    System.out.println("has Capturado un Charmeleon!");
                    Charmeleon charmeleon = new Charmeleon();
                    charmeleon.pokemon();
                    charmeleon.gritar();
                    break;
                  case 3:
                    System.out.println("has creado un Wartortle!");
                    Wartortle wartortle = new Wartortle();
                    wartortle.pokemon();
                    wartortle.gritar();
                    break;
                }
                  break;
                  case 3:
                    Pokebola bola3 = new Pokebola(3, "pokemon");
                    int guardar3;
                    do {
                      System.out.println("1. Guardar Charizard");
                      System.out.println("2. Guardar Blastoise");
                      System.out.print("Que pokemon desea guardar: ");
                      guardar3 = Entrada.nextInt();
                    } while (guardar3 < 1 || guardar3 > 2);
                switch (guardar3) {
                  case 1:
                    System.out.println("has Capturado un Charizard!");
                    Charizard charizard = new Charizard();
                    charizard.pokemon();
                    charizard.gritar();
                    break;
                  case 2:
                    System.out.println("has Capturado un Blastoise!");
                    Blastoise blastoise = new  Blastoise();
                    blastoise.pokemon();
                    blastoise.gritar();
                    break;
                }
                break;
            }
            break;
        }
    }
  }
}