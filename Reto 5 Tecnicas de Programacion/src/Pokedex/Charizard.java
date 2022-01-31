package Pokedex;

public class Charizard extends Pokemon {

  public Charizard() {
   super("Charizard", 1500, (byte) 100);
  }

  @Override
  public void evolucionar() throws NoEvolucionaException {
   throw new NoEvolucionaException();
  }

  @Override
  public void gritar() {
   System.out.println("Charizard!");
  }

}









