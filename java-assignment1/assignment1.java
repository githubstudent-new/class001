public class Assignment1 {

   public static void main(String args[]) {

     for(int k = 20; k >= 0; k = k - 1){
       String repeated = repeatString(" ", k);
       System.out.print(repeated); // print 20 times, then 19,18,17
       for(int x = 20; x >= k; x = x-1){
         System.out.print("#");
       }
       System.out.print("\n");
     }
   }
   public static String repeatString(String s, int n) {
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < n; i++) {
       sb.append(s);
     }

     return sb.toString();
   }
}

