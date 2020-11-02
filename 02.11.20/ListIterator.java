import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class ListIteratorExample {
  public static void main(String a[]){
    ListIterator<String> litr = null;
    List<String> name = new ArrayList<String>();
	List<String> place = new ArrayList<String>();
	List<String> animal = new ArrayList<String>();
	List<String> thing = new ArrayList<String>();
    name.add("Rishika");
    place.add("Hyderabad");
    animal.add("Dog");
    thing.add("Ball");
    litr=name.listIterator();
	litr=place.listIterator();
	litr=animal.listIterator();
    litr=thing.listIterator(); 
    System.out.println("Traversing the list in forward direction:");
    while(litr.hasNext()){
       System.out.println(litr.next());
    }
    System.out.println("\nTraversing the list in backward direction:");
    while(litr.hasPrevious()){
       System.out.println(litr.previous());
    }
  }
}
