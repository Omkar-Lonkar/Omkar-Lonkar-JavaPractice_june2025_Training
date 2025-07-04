public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println(sb1);
    }
}
