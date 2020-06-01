
public class ContinueTest01 {
    public static void main(String[] args) {
        a: for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            b: for (int y = 0; y < 10; y++) {
                if (y == 5)
                    // break a; 
                    // continue;
                    // continue a;
                
                System.out.print("y=" + y +" ");
            }
            System.out.println();
        }
    }
}