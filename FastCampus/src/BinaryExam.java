import java.lang.reflect.Type;

public class BinaryExam {
    public static void main(String[] args) {

        int decimal = 123; //10진수
        //souv 하면 system.out.println이 나온다
        System.out.println(decimal);

        int binaray = 0b01111011; //2진수
        System.out.println("binaray = " + binaray);

        int octal = 0173; //8진수
        System.out.println("octal = " + octal);

        int hexa = 0x7B; //16진수
        System.out.println("hexa = " + hexa);

        int b = 'B' + 1; // 아스키코드 더한 값인듯 
        System.out.println("(char)b = " + (char) b);

        char han = '가';

        int hanD = han;
        System.out.println("hanD = " + hanD);

        //16진수
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("hanU = " + (char) hanU);

        char upper = 'A';
        char lower = (char) (upper + 32); //upper 97이 정수 4byte가 되는데 char는 2byte 4byte 정수형 들어갈 수 없다. 그래서 캐스팅 해야함.
        System.out.println("hh = " + lower);

        //'1' + '2' = 3나오도록 프로그래밍
        // Char to Int - Ascii code 사용
        char aa = '1';
        char bb = '2';

        //int sum = Character.getNumericValue(aa) + Character.getNumericValue(bb);
        int sum = (aa - '0') + (bb - '0');

        System.out.println(sum);
    }
}
