public class FourArithmetic {

    /*
    - 실행 가능한 파일(out 폴더)은 .class로 만들어진다. (byte code)
    - 소스파일(src 폴더)은 .java로 저장한다. (컴파일러 -> .class)
    - JDK 설치 : java.exe(실행), javac.exe(컴파일러)
    - External Libraries - 자바에서 제공해주는 API(클래스들의 집합)를 사용하여 개발

    * 터미널에서(명령 프롬포트,콘솔) 컴파일,실행 해보기
    * javac -classpath ../out/produciton/FastCampus Calculator >> 컴파일 : javac.exe 소스파일
    * java -classpath ../out/produciton/FastCampus Calculator >> 실행 : java.exe 실행파일
    */
    public static void main(String[] args) {
        int a, b;

        a = 12;
        b = 2;

        System.out.println("a+b=" + (a + b));
        System.out.println("a+b=" + (a - b));
        System.out.println("a+b=" + (a * b));
        System.out.println("a+b=" + (a / b));
    }
}
