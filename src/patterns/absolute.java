package patterns;

public class absolute {
    public static void main(String[] args) {
         int tillcol;
        for(int i=0;i<9;i++){
            if(i<=4){tillcol=i;}
            else{tillcol=9-i-1;}
            for(int j=0;j<=tillcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
