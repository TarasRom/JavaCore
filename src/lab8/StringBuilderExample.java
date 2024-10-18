package lab8;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        String str = "World";
        StringBuilder sb3 = new StringBuilder(str);
        String str2 = sb3.toString();

        StringBuilder sb = new StringBuilder("I study Java");
        System.out.println(sb.length()); // 12

        System.out.println(sb.charAt(0)); // 'I'
        System.out.println(sb.charAt(8)); // 'J'

        sb.setCharAt(8, 'j');
        System.out.println(sb);  // I study java

        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        System.out.println(sb);  // study java

        sb.append(" very ")
                .append("much")
                .append("!");
        System.out.println(sb);  // study java very much!

        sb.insert(0, "I like ");
        System.out.println(sb);  // I like study java very much!

        sb.replace(13, 17, "Python");
        System.out.println(sb);  // I like study Python very much!

        sb.delete(13, 20);
        System.out.println(sb);  // I like study very much!

        System.out.println(sb.reverse());  // !hcum yrev yduts ekil I
    }
}
