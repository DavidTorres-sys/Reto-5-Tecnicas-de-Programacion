package Pokedex;

public class Wartortle extends Pokemon{
  public Wartortle() {
    super("Wartortle", 525, (byte) 25);
  }

  @Override
  public void evolucionar() {
    System.out.println();
  }

  @Override
  public void gritar() {
    System.out.println("Wartortle!");
  }
}
