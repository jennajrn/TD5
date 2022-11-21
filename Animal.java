package TD5;

public class Animal{
  private String nom;
  private int abs;
  private int ord;

  public void seDeplacer(int x, int y){
    abs = abs+x;
    ord = ord+y;
  }
}
