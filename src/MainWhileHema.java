public class MainWhileHema {
    public static void main(String[] args) {
        String name = "Hema";
        int i = 0;
        while (i < name.length() & name.charAt(i) != 'a') {
            System.out.println(name.charAt(i));
            i++;
        }
    }
}
