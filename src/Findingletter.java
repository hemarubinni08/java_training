public class Findingletter {
    public static void main(String[] args) {
        String name = "Deepak";
        int i = 0;

        while (i < name.length()) {
            if (name.charAt(i) != 'a') {
                System.out.println(name.charAt(i));
            }
            if(name.charAt(i) =='a'){
                break;
            }
            i++;
        }
    }
}