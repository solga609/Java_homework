import java.util.ArrayDeque;
public class Java_Homework_2 {
 
    
          
        public static void main(String[] args) {
              
            ArrayDeque<String> authors = new ArrayDeque<String>();
         
            authors.add("Arthur Conan Doyle");
            authors.addFirst("John Clare"); 
            authors.push("Charles Dickens"); 
            authors.addLast("Robert Browning"); 
            authors.add("Thomas Hardy");
              
          
            String sFirst = authors.getFirst();
            System.out.println(sFirst);    

            String sLast = authors.getLast();
            System.out.println(sLast);


            while(authors.peek()!=null){
               
            System.out.println(authors.pop());
             
            }
            
        }
    }
        
        
    
   
