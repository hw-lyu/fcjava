import java.util.Arrays;

public class BookTest
{
    public static void main(String[] args) {
//        Book a = new Book();
//        a.name = "야호";
//        a.price = 5000;
//
//        System.out.println(a.name + " / " + a.price);

//        String[] aa = {"1","2","3","4","5"};
//        //aa = new String[]{"1","2","3","4","5"};
//
//        System.out.println(Arrays.toString(aa));

        // 정수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하고 출력하세요
        int[] a = new int[]{10,10,10,10,10};

        // 정수 5개를 아래처럼 배열에 초기화 하고 index 0번쨰와 index 3번쨰 값을 더하여 출력하세요
        //int[] num = {10,20,30,40,50};
        int[] num;
        num = new int[]{10,20,30,40,50};

        int sum = num[0] + num[2];

        int length = num.length;// 5

        //아래 char 배열에 APPLE 이라는 문자가 저장되있다 소문자료 apple을 출력하시오
        char[] aa = {'A','P','P','L','E'};

        for(int n = 0; n < aa.length; n++) {
            aa[n] = (char)(aa[n] + 32);
        }

        System.out.println(aa);
    }
}
