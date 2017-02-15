package lab2.size;

public class IphoneSizeTest{

  public void testGetScreenSize(){
    System.out.println("Testing IphoneSize: :getScreenSize");
    IphoneSize iphoneSize = new IphoneSize(5.5);
    assert(iphoneSize.getScreenSize() == 5.5);
  }

  public static void main(String... args){
    IphoneSize iphoneSize = new IphoneSize();
    iphoneSize.getScreenSize();
    System.out.println("IphoneSize Test Passed");
  }
}
