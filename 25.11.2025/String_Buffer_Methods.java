package nov25_25;

public class String_Buffer_Methods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("adib");

        System.out.println("Original: " + sb);

        sb.append(" Coding");
        System.out.println("1. append(): " + sb);

        sb.insert(4, " Loves");
        System.out.println("2. insert(): " + sb);

        sb.delete(4, 10);
        System.out.println("3. delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("4. deleteCharAt(): " + sb);

        sb.replace(0, 3, "Hey");
        System.out.println("5. replace(): " + sb);

        sb.reverse();
        System.out.println("6. reverse(): " + sb);

        System.out.println("7. capacity(): " + sb.capacity());
    }
}