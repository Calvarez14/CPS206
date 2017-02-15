package lab2.size;

public class IphoneSize{
  private final double screenSize;

  private IphoneSize(){
    this.screenSize = 0.0;
  }

  public IphoneSize(double screenSize){
    this.screenSize = screenSize;
  }

  public double getScreenSize(){
    return this.screenSize;
  }
}
