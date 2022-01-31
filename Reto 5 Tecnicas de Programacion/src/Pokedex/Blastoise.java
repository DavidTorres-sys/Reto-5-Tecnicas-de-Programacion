package Pokedex;

public class Blastoise extends Pokemon{

  public Blastoise() {
    super("Charizard", 1700, (byte) 100);
  }

  @Override
  public void evolucionar() throws NoEvolucionaException {
    throw new NoEvolucionaException();
  }

  @Override
  public void gritar() {
    System.out.println("Blastoise!");
  }
}
