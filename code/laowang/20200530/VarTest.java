
/**
 * @author wh
 * @version 1.0
 * @since 1
 * 
 */
public class VarTest {
    int i = 1000;
    /**
     * @author wh
     * @version 1.0
     * @since 1
     * @param String[] args 
     */
    public static void main(String[] args) {
        // int nianling = 20;
        // System.out.println(nianling);
        // System.out.println(this.i);
        // byte nianling = 100;
        // System.out.println(nianling);
        VarTest test = new VarTest();
        test.haha();
        int i ;
        for(i=0;i<10;i++){
        
        }
        System.out.println(i);
    }

    void haha(){
        i = 10000;
        System.out.println(this.i);
    }

}