public class CastingTest {
    public static void main(String[] args) {
        double a = 5.5;
        int b = (int)a; // 강제 형변환 5.5 -> 5

        int c = 5;
        double d = c; // 자동 형변환 5 -> 5.0
        System.out.println(b);
        System.out.println(d);
    }
}
