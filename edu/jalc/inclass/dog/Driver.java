public class Driver{
  public static void main(String... args){
    Dog fido = new Dog("fido");
    Dog spot = new Dog("spot");

    System.out.println(fido.equals(spot)); //<-- USEFULL #2
    System.out.println(fido); //<-- USEFULL #1  //(fido.toString());
    System.out.println(fido.hashCode());

  }
}
