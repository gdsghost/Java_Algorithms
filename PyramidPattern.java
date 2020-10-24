public class Pattern {

    public static void main(String[] args) {
        int rows , k = 0;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
