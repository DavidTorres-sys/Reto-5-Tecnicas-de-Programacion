package Pokedex;

public abstract class Pokemon {

  private String nombre;
  private int nivelSalud;
  private byte nivel;

  public Pokemon(String nombre, int nivelSalud, byte nivel) {
    this.nombre = nombre;
    this.nivelSalud = nivelSalud;
    this.nivel = nivel;
  }

  public abstract void evolucionar();
  public abstract void gritar();

  public void pokemon() {
    System.out.println("Pokemon: " + nombre + "\nNivel: " + nivel + "\nNivel de salud: " + nivelSalud);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getNivelSalud() {
    return nivelSalud;
  }

  public void setNivelSalud(int nivelSalud) {
    this.nivelSalud = nivelSalud;
  }

  public byte getNivel() {
    return nivel;
  }

  public void setNivel(byte nivel) {
    this.nivel = nivel;
  }
}
