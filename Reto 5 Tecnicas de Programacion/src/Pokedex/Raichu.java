package Pokedex;

public class Raichu extends Pokemon {
  public Raichu() {
    super("Pokedex.Raichu", 480, (byte) 25);
  }

  @Override
  public void evolucionar() {
    System.out.println();
  }

  @Override
  public void gritar() {
    System.out.println("Raichu!");
  }
}
