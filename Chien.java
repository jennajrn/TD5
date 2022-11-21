package TD5;

public class Chien extends Animal implements Bruit{
  @Override
  public void seDeplacer(int x, int y){
    super.seDeplacer(x,y);
    System.out.println("Wouf, je bouge");
  }

  public void faireDuBruit(){
    System.out.println("Wouf");
  }
}
