import java.util.Vector;

public class helloworld{
    public static void main(String[] args) {
        System.out.println("Hello Giacomo Bono!");
        
        Vector<Character> lettere = new Vector<>();
        lettere.add('g');
        lettere.add('i');
        lettere.add('a');
        lettere.add('c');
        lettere.add('o');
        lettere.add('m');
        lettere.add('o');

        for(Character lettera : lettere){
            System.out.println(lettera);
        }
    }
}