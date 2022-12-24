package OOP.inheritance;

public class boxWeight extends box {
    double weight;
    boxWeight(){
        this.weight = 1;
    }
    boxWeight(int l, int b, int h ,double weight){
        super(l,b,h);
        this.weight = weight;

    }

    public static void main(String[] args) {
        boxWeight box1 = new boxWeight(12,12,15,45);
        System.out.println(box1.weight + " " + box1.b + " "+ box1.h + " " + box1.l);


    }
}
