package TD5;

public class Chat extends Animal implements Bruit{
  @Override
  public void seDeplacer(int x, int y){
    super.seDeplacer(x,y);
    System.out.println("Miaou, je bouge");
  }

  public void faireDuBruit(){
    System.out.println("Miaou");
  }
}
