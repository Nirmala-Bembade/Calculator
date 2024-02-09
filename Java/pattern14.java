public class pattern14 {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<n;i++)
        {
            for(int j=3;j<n*2;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
