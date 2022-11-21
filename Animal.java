package TD5;

public class Animal{
  private String nom;
  private Point point = new Point();

  public void seDeplacer(int x, int y){
    this.point.translation(x,y);
  }
}
