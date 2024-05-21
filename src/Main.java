import java.util.*;
public class Main {
    public static void main(String[] args) {
            String s = "This is a dAmo of the getChars method,";
            int start = 10;
            int end = 14;
            char buf[] = new char[10];

            //System.out.println("Character at 10 =" s.charAt(10)

        s.getChars(start,end,buf,0);
        System.out.println(buf);
        s.getChars(start, end, buf,5);
        System.out.println(buf);

        byte bt[] = new byte[10];
        s.getBytes(start,end, bt,0);
        System.out.println(bt[0]);
        System.out.println(bt[1]);
        System.out.println(bt[2]);
        System.out.println(bt[3]);

        char buf1[] = s.toCharArray();
        System.out.println(buf1);





    }
}