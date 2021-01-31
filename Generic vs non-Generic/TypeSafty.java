import java.util.ArrayList;

public class TypeSafty {
    public static void main(String[] args) {
         // Creating an ArrayList without any type specified 
         ArrayList al = new ArrayList(); 
  
         al.add("Sachin"); 
         al.add("Rahul"); 
         al.add(10); // Compiler allows this 
   
         String s1 = (String)al.get(0); 
         String s2 = (String)al.get(1); 
   
         try { 
             // Causes Runtime Exception 
             String s3 = (String)al.get(2); 
         } 
         catch (Exception e) { 
             System.out.println("Exception: " + e);
         }
    }
}
