import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if(n<30){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}