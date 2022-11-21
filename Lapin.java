package TD5;

public class Lapin extends Animal{
  @Override
  public void seDeplacer(int x, int y){
    super.seDeplacer(x,y);
    System.out.println("lapin, je bouge")
  }
}
