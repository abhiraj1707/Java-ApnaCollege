public class String_Builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='A'; ch<='Z'; ch++) {
            sb.append(ch);
        }
        //ABCD......
        //0(26)

        System.out.println(sb);
    }
}
