package lab1;

public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int reduction = reduce(100, counter);
        System.out.println(reduction);
    }
    public static int reduce(int n, int counter){
        if (n == 0){return counter;}
        else if (n % 2 == 0){counter++; return reduce(n/2, counter);}
        else{counter++; return reduce(n-1, counter);}
    }

}
