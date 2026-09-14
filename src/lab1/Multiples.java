package lab1;

public class Multiples {
    public static void main(String[] args){
        /*We're looking for integers greater than 0 that are multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are
         four below 10. How many are below 1000? */
        int counter = 0;
        for (int i = 1000; i >= 3; i--){
            boolean multi5 = i % 5 == 0;
            boolean multi3 = i % 3 == 0;
            if (i % 5 == 0) {
                counter++;
            } else if (i % 3 == 0) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
