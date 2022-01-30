package Pokedex;

public class Pikachu extends Pokemon{
  public Pikachu() {
    super("Pikachu", 220, (byte) 1);
  }

  @Override
  public void evolucionar() {
    System.out.println();
  }

  @Override
  public void gritar() {
    System.out.println("Pikachu!");
  }
}
