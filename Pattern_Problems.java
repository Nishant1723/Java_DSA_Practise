package DSA;

public class Pattern_Problems {
    public static void main(String[] args) {
        pattern6(5);

    }


    //    Pattern1
    public static void pattern1(int n) {
        for(int row = 1; row <=n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern2
    public static void pattern2(int n) {
        for(int row = 1; row <=n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Pattern3
    public static void pattern3(int n) {
        for(int row = 1; row <=n; row++) {
            for(int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Pattern4
    public static void pattern4(int n) {
        for(int row = 1; row <=n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for(int row = 1; row <=2*n; row++) {
            int totalColInRow = row > n ? 2 * n - row   : row;
            for(int col = 1; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int row = 1; row <=2*n; row++) {
            int totalColInRow = row > n ? 2 * n - row   : row;
            int noOfSpaces = n-totalColInRow;
            for(int s = 1; s<=noOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col = 1; col <=totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern7(int n) {
        for(int row = 1; row <=n; row++) {

            int noOfSpaces = n-row;
            for(int s = 0; s<noOfSpaces; s++) {
                System.out.print(" ");
            }

            for(int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for(int col = 2; col<= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    public static void pattern8(int n) {
        for(int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row   : row;

            int noOfSpaces = n-c;
            for(int s = 0; s<noOfSpaces; s++) {
                System.out.print(" ");
            }

            for(int col = c; col >= 1; col--) {
                System.out.print(col);
            }
            for(int col = 2; col<= c; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        int originalOne = n;
        n = 2 * n;
        for(int row = 0; row <=n; row++) {
            for(int col = 0 ; col <= n; col++) {
                int atEveryIndex = originalOne - Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


    public static void pattern10(int n) {
        for(int row = 1; row<=n; row++) {
            for(int col = 1; col <=n; col++ ){
                System.out.print("*" + " ") ;
            }
            System.out.println();
        }
    }


    public static void pattern11(int n) {
         for(int row = 0; row < n; row++){

             for(int s = 0; s < n-row; s++){
                 System.out.print("  ");
             }

             for(int col = 0; col <= row; col++){
                 System.out.print("* ");
             }

             System.out.println();
         }
     }

    public static void pattern12(int n) {
        for(int row = 0; row < n; row++){

            for(int s = 0; s < row; s++){
                System.out.print("  ");
            }

            for(int col = 0; col < n - row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void pattern13(int n) {
        for(int row = 0; row < n; row++) {
            int totalColInRow = n - row;
            int noOfSpaces = n-totalColInRow;
            for(int s = 0; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for(int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for(int row = 0; row < n; row++){

            for(int s = 0; s < n - row; s++){
                System.out.print("  ");
            }

            for(int col = 0; col < 2 * row + 1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for(int row = 0; row < n; row++) {

            for(int s = 0; s <= n - row; s++) {
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for(int row = 0; row < n; row++){

            for(int s = 0; s < row; s++){
                System.out.print("  ");
            }

            for(int col = 0; col < (2 * (n - row)) - 1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for(int row = 0; row < 2 * n; row++){
            int s;
            int c = row >= n ? 2 * n - 1 - row : row;
            for( s = 0; s < c; s++){
                System.out.print("  ");
            }

            for(int col = s; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }








}



