package demo;
import java.util.ArrayList;  
public class first_last { 
public static void main(String[] args) 
    {   
        ArrayList<Integer> list = new ArrayList<Integer>(5); 
  
         
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
  
      
        System.out.print("ArrayList: " + list); 
  
        
        int first = list.get(0); 
  
       
        int last = list.get(list.size() - 1); 
  
    
        System.out.println("\nFirst : " + first 
                           + ", Last : " + last); 
    } 
} 

