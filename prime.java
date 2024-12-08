class prime{
    public static void main(String[]args)
    {
        int n=23,flag=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("yes");
        else
         System.out.println("no");
    }
}
