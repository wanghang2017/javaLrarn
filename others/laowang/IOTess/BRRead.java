import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRRead {
    public static void main (String[] args){
        char c=' ';
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符,按下'q'退出");
        do{
            try{
                c= (char) br.read();
                System.out.println(c);
            }catch(Exception e){
                
            }
        }while (c!='q');
    }
}