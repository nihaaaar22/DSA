package randomExperiment;

public class moneySpentInStock {
    public static void main(String args[]) {
        int spent = 0;
        int x = 500;
        int yrs = 0;
        while (yrs<=40){
            yrs++;
            spent += (x*12);
            x += x/10;
        }
        System.out.println("total money spent:"+ spent);
        System.out.println(2+3*5);
    }
}