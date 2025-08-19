public class Main6 {
    public static void main(String[] args) {
        int codePoint = 0x1F3A2;
        System.out.println(codePoint);
        char hs = Character.highSurrogate(codePoint);
        char ls = Character.lowSurrogate(codePoint);
        char [] item = {hs,ls};
        System.out.println(item);
    }
}
