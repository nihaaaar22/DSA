package patterns;

public class numbersPyramid {
    public static void main(String args[]){
        int n =5;
        for(int i =0;i<n;i++){
            for(int j = (n-i);j>0;j--){
                System.out.print("  ");
            }
            for(int j = i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(j+2+" ");
            }
            System.out.println();

        }
    }
}
