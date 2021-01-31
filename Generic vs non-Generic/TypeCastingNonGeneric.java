import java.util.ArrayList;

public class TypeCastingNonGeneric {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // For every retrieval, 
        // it needs to be casted to String for use 
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
        System.out.println(s1);
        System.out.println(s2);
    }
}
