public class Recursion_001_pattern {
    public static void main(String[] args) {
        Draw(5, 0);
        Draw(5, 5);
    }

    static void Draw( int row , int  col){
         if (row == 0) {
            return;
         }
         if (row > col) {
            System.out.print("* ");
            Draw(row, col+1 );
         }else{
            System.out.println();
            Draw(row-1, 0);
         }
    }

    static void Draw2(int row , int col){
       
    }
}
