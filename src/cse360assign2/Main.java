package cse360assign2;

public class Main {

   public static void main(String[] args){
        Calculator x = new Calculator();

        x.add(0);
        x.subtract(0);
        x.divide(3);
        x.multiply(1);
        x.add(1);

        System.out.println(x.getTotal());
        System.out.println(x.getHistory() + '\n');

       Calculator y = new Calculator();

       y.add(4);
       y.subtract(2);
       y.multiply(2);
       y.add(5);
       y.divide(4);
       y.add(0);

       System.out.println(y.getTotal());
       System.out.println(y.getHistory());


    }
}
