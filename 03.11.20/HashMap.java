import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Details {
   public static void main(String args[]) {
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(12, "Rishika");
      hmap.put(2, "Rajesh");
      hmap.put(7, "Amuktha");
      hmap.put(49, "Arjun");
      hmap.put(3, "Anirudh");
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var)
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
       }

   }
}