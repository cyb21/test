import java.util.Random;

public class HelloW {
    public static void main(String[] args) {
        int i =0;
        while(i<7){
            while(i<5){
                if(i>=3){
                    break;
                }
//              Random random = new Random();
                System.out.println("Hello, World! " + i);
                i++;
            }
            System.out.println("Hello " + i);
            i++;
        }
    }
}
