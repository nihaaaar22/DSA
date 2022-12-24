package patterns;

public class decendingStep {
    public static void main(String args[]){
        for(int i =0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print('$'+' ');
            }
            System.out.println();
        }
        System.out.println((int)('$'));
        System.out.println((char)(35));
    }
}
