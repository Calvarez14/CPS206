public DriverAnonymous{

  static int count = 0;

  public static void main(String... args){

    Runnable runanable = new Runnable(){

      public void run(){
        int myNumber = count;
        count++;
        try{
          Thread.sleep(int) (Math.random() * 10000));
          System.out.println("Thread- "+ myNumber + " Running");
        }
        catch (Exception e){
          System.out.println("Thread- "+ myNumber + " interrupt");
        }
      }
    };
    for(int i = o; i < 10; i++){
      new ThreadRunnable().start();
    }
  }
}
