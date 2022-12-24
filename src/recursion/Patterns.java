package recursion;

public class Patterns {
    public static void main(String[] args) {
        dispTriangle(5,0);
        dispStTriangle(5,0 );

    }


    static void dispTriangle(int rows,int col){

       //****
       //***
       //**
        // *

        if(rows== 0){return;}
        if(col<rows){
            System.out.print('*');
            dispTriangle(rows,col+1);
        }
        else{
            System.out.println();
            dispTriangle(rows-1,0);
        }

    }
    //just call the function first to display straight triangle


    static void dispStTriangle(int rows,int col){
        if(rows== 0){
            return;
        }
        if(col<rows){

            dispStTriangle(rows,col+1);

            System.out.print('*');

        }
        else{

            dispStTriangle(rows-1,0);
            System.out.println();

        }

    }
}
