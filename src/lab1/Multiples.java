package lab1;

public class Multiples {
    public static void main(String[] args){
        /*We're looking for integers greater than 0 that are multiples of 3 or 5. The first four are 3, 5, 6, and 9, so there are
         four below 10. How many are below 1000? */
        int counter = multiples(1000, 3, 5);
        System.out.println(counter);

    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = n-1; i >= 1; i--){
            boolean multib = i % b == 0;
            boolean multia = i % a == 0;
            if (multib) {
                counter++;
            } else if (multia) {
                counter++;
            }
        }
        return counter;
    }
}
