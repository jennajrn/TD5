package TD5;

public class Chien extends Animal{
  @Override
  public void seDeplacer(int x, int y){
    super.seDeplacer(x,y);
    System.out.println("Wouf, je bouge");
  }
}
