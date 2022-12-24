package strings;

public class SB {
    public static void main(String args[]){
        StringBuilder builder = new StringBuilder("");
        for(int i =0;i<26;i++) {
            builder.append((char)('a' + i));

        }
        System.out.println(builder);
        builder.delete(5,26);
        System.out.println(builder.reverse());
        System.out.println(builder.append(234));

    }
}
