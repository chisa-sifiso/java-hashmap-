
package hashmap;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> map =new HashMap<>();
        
        if(map.isEmpty()){
            map.put(1,"one");
            map.put(2,"two");
            map.put(3,"three");
            map.put(4,"four");
            for(Integer i:map.keySet()){
                System.out.println("Key: "+i+"\tValue: "+map.get(i));
            }
            //showing a value using a key eg key4
            System.out.println("The value of key 4 is "+map.get(4));
            //removing key 4
            map.remove(4);
            for(Integer i:map.keySet()){
                System.out.println("Key: "+i+"\tValue: "+map.get(i));
            }
            //searching for a specific value
            //i will be seaching for key 2
            if(map.containsKey(2)){
                    System.out.println("key 2 has been found and has a value of "+map.get(2));
             }
            
        }else{
            System.out.println("The map is not empty");
        }
        
        // the excise
        Map<String,Integer> map1 =new HashMap<>();
        String sen = "This is my name,i am sifiso vinjwa,vinjwa the king sifiso";
        sen=sen.replace(',', ' ').replace('.', ' ').trim();
        String[] words=sen.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        for (int i = 0; i < words.length; i++) {
          if(map1.containsKey(words[i])){
             int temp = map1.get(words[i]);
             map1.put(words[i], temp+1);
          } 
          else {
          map1.put(words[i], 1);
          }
            
        }
        System.out.println("\n\nNumber of times word occured");
        for(String i : map1.keySet()){
            System.out.println(i+" "+map1.get(i));
        }
    }
    
}
