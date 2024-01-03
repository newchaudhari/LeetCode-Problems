package arrays;

public class TP {
    public static void main(String[] args) {
        System.out.println(integer());
    }
    public static int integer(){
        int counter=0;
        for (int i = 0; i < 5; i++) {
            if (i%2==0) continue;
            counter++;
        }
        return counter;
    }
}
