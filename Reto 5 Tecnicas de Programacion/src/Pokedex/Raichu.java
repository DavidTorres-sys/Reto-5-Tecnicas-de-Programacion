package Pokedex;

public class Raichu extends Pokemon {
  public Raichu() {
    super("Raichu", 480, (byte) 25);
  }

  @Override
  public void evolucionar() throws NoEvolucionaException {
    throw new NoEvolucionaException();
  }

  @Override
  public void gritar() {
    System.out.println("Raichu!");
  }
}
