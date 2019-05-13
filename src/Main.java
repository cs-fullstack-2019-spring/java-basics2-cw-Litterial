import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        ex2();
//        ex3();
        ex4();
//        ex5a();
    }

    private static void ex2() {
        for (int x = 0; x <= 100; x++) {
            if (x % 2 == 0) //only print even numbers
                System.out.println(x);
            x++;
        }
    }

    private static void ex3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non-negative integer");
        int number = Math.abs(scan.nextInt());
        for (int num = 0; num <= number; num++) {
            System.out.println(num);
        }

    }

    private static void ex4() {
        Scanner scan = new Scanner(System.in);
        String guess;
        System.out.println("Enter a secret word");
        String secretword = scan.next();
        int total = 0;
        while (total < 5) {
            System.out.println("Guess the secret word");
            total++;
            guess = scan.next();
            if (guess.trim().equals(secretword)) {
                System.out.println("That's correct!!  Total guesses: " + total);
                total--; //brings the total under 5 so the game over message will not display if the user gets it correct on their 5th count
                break;
            } else if (total<5)  // As long as the total is less than 5 they will see this fail message
                System.out.println("Incorrect. Try again");
        }

        if (total == 5) // if the total is
            System.out.println("Sorry. You lose");
    }

    private static void ex5a()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non-negative integer to see stars");
        int number = Math.abs(scan.nextInt()); // I don't like negative numbers
        ex5b(number); // calls a function that will list the stars
    }

    private static void ex5b(int total)
    {
        StringBuffer str=new StringBuffer(); //function that allows us to append items to a string
        for (int starcount=0; starcount<=total; starcount++)
        {
            String star="*";
            str.append(star);
            System.out.println(str);

        }
    }

}
