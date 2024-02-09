public class pattern12 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
