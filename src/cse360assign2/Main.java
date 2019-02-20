package cse360assign2;

public class Main {

   public static void main(String[] args){
        Calculator x = new Calculator();

        x.add(-3);
        x.subtract(3);
        x.divide(3);
        x.multiply(3);

        System.out.println(x.getTotal());
        //System.out.println(x.getHistory());
    }
}
