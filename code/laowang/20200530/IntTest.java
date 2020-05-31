// package code.laowang.20200530;

public class IntTest {
    public static void main(String[] args){
        byte a = (byte)10000;
        System.out.println(a);
        long d = 2147483648L;
        System.out.println(d);

        char c = 1;
        System.out.println(c);

        boolean e = true;
        System.out.println(e);


        byte x = (byte)150; 
        // 00000000 00000000 00000000 10010110
        
        // 10010110
        // 10010101
        // 11101010
        // -106
        System.out.println(x);


        short xx= 126;
        byte xxx = 10;

        short xxx1 = 1;
        byte xxx2 = 1;
        
        // short xxx3 = xxx1+xxx2;

        System.out.println(xxx1+xxx2);
    }


}