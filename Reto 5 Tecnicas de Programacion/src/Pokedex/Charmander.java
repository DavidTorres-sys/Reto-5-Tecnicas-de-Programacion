package Pokedex;

public class Charmander extends Pokemon {

  public Charmander() {
    super("Charmander", 250, (byte) 1);
  }

  @Override
  public void evolucionar() {
    Charmeleon charmeleon = new Charmeleon();
  }

  @Override
  public void gritar() {
    System.out.println("Charmander!");
  }
}
