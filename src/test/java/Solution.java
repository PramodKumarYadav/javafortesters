import java.util.Scanner;

class Solution
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to test1 the Sum of two numbers");
        int n = sc.nextInt();
        for(int t = 0; t < n; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of these two numbers is : " );
            System.out.println(a+b);
        }
    }

}