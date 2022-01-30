package Pokedex;

public class Squirtle extends Pokemon{
  public Squirtle() {
    super("Squirtle", 255, (byte) 1);
  }

  @Override
  public void evolucionar() {
    System.out.println();
  }

  @Override
  public void gritar() {
    System.out.println("Squirtle!");
  }
}
