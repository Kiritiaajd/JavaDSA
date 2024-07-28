public class Recursion_001_pattern {
   public static void main(String[] args) {
      Draw(5, 0);
      Draw2(5, 0);
   }

   static void Draw(int row, int col) {
      if (row == 0) {
         return;
      }
      if (row > col) {
         System.out.print("* ");
         Draw(row, col + 1);
      } else {
         System.out.println();
         Draw(row - 1, 0);

      }
   }

   static void Draw2(int row, int col) {
      if (row == 0) {
         return;
      }
      if (col < row) {
         Draw2(row, col + 1);
         System.out.print("* ");

      } else {

         Draw2(row - 1, 0);
         System.out.println();
      }
   }
}
