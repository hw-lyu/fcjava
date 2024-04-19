import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int num = scan.nextInt(); // 정수입력
        //float floatNum = scan.nextFloat(); // 실수입력
        //double doubleNum = scan.nextDouble(); // 실수 입력
        //String str = scan.next(); // 문자열 입력 (공백 앞까지 입력 받음)
        //String lineStr = scan.nextLine(); // 문자열 입력 (엔터까지 받음)

        // 아래 책 정보를 키보드로 입력하시오.
        // 제목 - 자바/ 가격 - 30000/ 출판사 - 패스트캠퍼스, 저자 - 박메일/ 페이지수 - 700/ ISBN - 119910

        String bookName = scan.next();
        int price = scan.nextInt();
        String pub = scan.next();
        String writer = scan.next();
        int pageCount = scan.nextInt();
        int isbn = scan.nextInt();

        System.out.println(" 제목: " + bookName + " 가격 : " + price + " 출판사 : " + pub + " 저자 : " + writer + " 페이지수 : " + pageCount + " ISBN : " + isbn);
    }
}
