package StringBuffer;

public class SB_first {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Vedaant");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Bisht"));

        String re=sb.toString();  // Converting to String
        System.out.println(re);

        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(0,"Artemis ");
        System.out.println(sb);

        sb.setLength(32);
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb);


    }
}
