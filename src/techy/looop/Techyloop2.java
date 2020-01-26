package techy.looop;

public class Techyloop2 {

    public static void main(String[] args){

        hwLoop();
        hwNaturalNum();
        hwDescendingOrder();
        hwMultiplication();
        hwReturnMaxNum();
        hwPrimeNum();




    }

    // Practicing loop....

        public static void hwLoop() {

            for (int i = 1; i <= 10; i++) {

                System.out.println(i + " Bangladesh");

            }

            int x = 1;

            while (x <= 10) {

                System.out.println(x + " Michigan");

                x++;
            }

           int y = 1;

            do {
                System.out.println(y + " Sylhet");
                y++;


            }while (y <=10);

        }


        // program to calculate the sum of first 10 natural numbers.....

        // 1+2+3+4+5+6+7+8+9+10 = 55 will b result.....

    public static void hwNaturalNum() {

        int joy = 0;

        for(int t=1; t<=10; t++) {

            joy = joy + t;
        }

        System.out.println(joy);

        }

        // Displaying numbers in descending order in the step of 5 starting from 100......for example: 100,95,90,85 etc.

    public static void hwDescendingOrder() {


        for (int s = 100; s >= 5; s = s - 5) {

            System.out.println(" " + s);
        }
    }

    // multiplication table......


    public static void hwMultiplication() {


        int y = 9;

        for(int e=1; e <= 10; e++)
        {
            System.out.println(y+" * "+e+" = "+y * e);
        }


    }

    // method that accepts two numbers are returns the maximum of Two

    public static void hwReturnMaxNum () {

        int p = 300;
        int q = 250;

        // prints the maximum of two numbers

        System.out.println(Math.max(p, q));
    }


    // Prime number check....

public static void hwPrimeNum (){

    int num = 17;
    boolean taf = false;
    for(int i = 2; i <= num/2; ++i)
    {
        // condition for nonprime number
        if(num % i == 0)
        {
            taf = true;
            break;
        }
    }
    if (!taf)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
}

}





