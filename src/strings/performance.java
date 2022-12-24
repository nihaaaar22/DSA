package strings;

public class performance {
    public static void main(String args[]){
        String series = "";
        for(int i = 0;i<26;i++) {
            char ch = (char)('a' + i);
            series+= ch;
        }
        System.out.println(series);
        series.toUpperCase();//any function will only create a new object and not affect the original object cuz strings are immutable.
        System.out.println(series.toUpperCase());
        System.out.println(series);

    }
}
