import java.util.Vector;

public class Hello {

    public static void main(String[] args) {
 
       System.out.println("Hello Fabio !");
       
       Vector<Character> lettere = new Vector<>();
       lettere.add('f');
       lettere.add('a');
       lettere.add('b');
       lettere.add('i');
       lettere.add('o');
   
       for (Character lettera : lettere) {
           System.out.println(lettera);
       }
    }
 }