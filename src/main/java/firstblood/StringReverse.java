package firstblood;

public class StringReverse {
    public static void main(String[] args) {
        String a="12321,adcd";
        StringBuilder b= new StringBuilder();
        for (int i = a.length()-1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
