public class DriverLambda{

  static int count = 0;

  public static void main(String... args){

    for(int i = 0; i < 10; i++){
      new Thread(() -> {
        int myNumber = count;
        count++;
        try{
          Thread.sleep(int) (Math.random() * 10000));
          System.out.println("Thread- "+ myNumber + " Running");
        }
        catch (Exception e){
          System.out.println("Thread- "+ myNumber + " interrupt");
        }
      }).start();
    }
  }
}
