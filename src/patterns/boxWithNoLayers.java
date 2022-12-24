package patterns;

public class boxWithNoLayers {
    public static void main(String[] args) {
        int n = 4;
        for (int i =0;i<=n*2;i++){
            for(int j =0;j<=n*2;j++){
                System.out.print(Math.min(n*2-i,Math.min(n*2-j,Math.min(i,j)))+ " ");
            }
            System.out.println();
        }
    }
}
