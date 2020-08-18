public class Calc
{
    int add(int a, int b)
    {
        return(a+b);
    }
    int sub(int a, int b)
    {
        return(a-b);
    }
    public static void main(String arg[]) 
    {
        int a = 0, int b = 0 ;
        Scanner sc = new Scanner(System.in); 
        Calc c = new Calc();
        System.out.println("Enter first number :-");
        a = sc.nextInt();
        System.out.println("Enter Second number :-");
        b = sc.nextInt();
        System.out.println("Addition is :- "+c.add(a,b));
        System.out.println("Subtraction is :- "+c.sub(a,b));
    }
}