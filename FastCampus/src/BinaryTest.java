public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'A';
        java.lang.String s = "APPLE";
        // 69를 10진수, 2진수, 8진수 16진수로 출력하시오.

        int decimal = 69; //10진수
        System.out.println(decimal);

        int binaray = 0b01000101; //2진수
        System.out.println("binaray = " + binaray);

        int octal =0105; //8진수
        System.out.println("octal = " + octal);
        
        int hexa = 0x45; //16진수
        System.out.println("hexa = " + hexa);
    }
}
