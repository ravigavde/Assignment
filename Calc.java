public class Calc
{
    int add(int a, int b)
    {
        return(a+b);
    }
    int sub(int a, int b)
    {
        if((a-b)>0)
        {
            return(a-b);
        }
        else
        {
            return(!(a-b));
        }
    }
     int div(int a, int b)
    {
        if(b==0)
        {
            return(-1);
        }
        else
        {
            return(a/b);
        }
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
        if((int h = c.div(a,b))!=-1)
        {
            System.out.println("Subtraction is :- "+c.div(a,b));
        }
        else
        {
            System.out.println("Cannot divide by zero ");
        }
    }
}