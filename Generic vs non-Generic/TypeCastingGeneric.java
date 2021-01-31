import java.util.ArrayList;

public class TypeCastingGeneric {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // Retrieval can be easily 
        // without the trouble of casting 
        String s1 = al.get(0); 
        String s2 = al.get(1); 
        System.out.println(s1);
        System.out.println(s2);
        
    }
}
