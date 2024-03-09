package lab8;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder("Hello");
        String s3 = "World";
        StringBuilder s4 = new StringBuilder(s3);
        String string = s4.toString();

        StringBuilder sb = new StringBuilder("I study Java");
//        System.out.println(sb.length()); // 12
//
//        System.out.println(sb.charAt(0)); // 'I'
//        System.out.println(sb.charAt(8)); // 'J'

        sb.setCharAt(8, 'j');
        System.out.println(sb);

        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.append(" very ")
                .append("much")
                .append("!");
        System.out.println(sb);

        sb.insert(0, "I like ");
        System.out.println(sb);

        sb.replace(13, 17, "Python");
        System.out.println(sb);

        sb.delete(13, 20);
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
