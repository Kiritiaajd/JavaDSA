public class Star_pattern01 {
    public static void main(String[] args) {
        int n = 5 ;
          for (int i =  1; i <n; i++) {
            for (int j = 0; j <=i ; j++) {
                  System.out.print("* ");
            }
            System.out.println();
          }

          /*
           * * * * 
           * * *
           * *
           *
           */
         System.out.println("\n\n");
          for (int i =  1; i <=n; i++) {
            for (int j = 1; j <n-i+1; j++) {
                  System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        for (int i =  1; i < n; i++) {
            for (int j = 1; j <i+1; j++) {
                  System.out.print(j+" ");
            }
            System.out.println();
        }


    }   
}
