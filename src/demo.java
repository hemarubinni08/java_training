public class demo {
    public static void main(String[] args) {
        String name = "Raja";
        char[] character = name.toCharArray();
        int i = 0;
        while (i < character.length) {
            if (character[i] != 'a') {
                System.out.println(character[i]);
                i++;
            }
        }
    }
}
