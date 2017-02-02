import java.util.ArrayList;

public class GenericExample{
   public static void main(String... args){
      ArrayList<String> list = new ArrayList<>();
      System.out.println(list.size());
      list.add("Cesar");
      System.out.println(list.size());
      list.add(0,"Alvarez");
      System.out.println(list);
      System.out.println(list.contains("Alvarez"));
      System.out.println(list.contains("Alvarez"));

      String firstName = list.get(1);
      System.out.println(firstName);

   }
}
