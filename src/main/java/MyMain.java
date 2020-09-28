import java.util.Scanner;
public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int x = (int) (Math.random() * 6);
        return x + 1;
    }
    // Rolls two dice n times

    // -- in the README you said to roll n dice, but I assume this was a mistake.

    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] returners;
        returners = new int[11];
        int[] results;
        results = new int[n];
        for (int i = 0; i < results.length; i++){
            results[i] = rollDie() + rollDie();
            for (int j = 0; j < returners.length; j++){
                if (results[i] == j + 2){
                    returners[j] += 1;
                }
            }
        }
        return returners;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pairs of dice would you like to roll?");
        int x = scan.nextInt();
        int[] printers = sumOfTwoDice(x);

        for (int i = 0; i < printers.length; i++){
            
            double p = (printers[i] / ((double) x )) / 100.0;
            System.out.println("% of rolls where sum == " + (i + 2) + ": " + p);
        }
        scan.close();
    }
}