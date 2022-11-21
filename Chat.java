package TD5;

public class Chat extends Animal{
  @Override
  public void seDeplacer(int x, int y){
    super.seDeplacer(x,y);
    System.out.println("Miaou, je bouge");
  }
}
