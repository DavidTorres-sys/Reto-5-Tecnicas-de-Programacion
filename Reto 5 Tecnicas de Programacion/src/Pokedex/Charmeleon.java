package Pokedex;

public class Charmeleon extends Pokemon {

  public Charmeleon() {
    super("Charmeleon", 500, (byte) 25);
  }

  @Override
  public void evolucionar() {
    System.out.println();
  }

  @Override
  public void gritar() {
    System.out.println("Charmeleon!");
  }

}
