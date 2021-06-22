public class ternaryOperator {
    public static void main(String[] args){
        /*
        Ternary Operator:
        variable = (condition)? expression1 : expression2

         */
        int x,y;
        x = 20;
        y = (x==1) ? 61:90; //condition is false, so exp2 is executed
        System.out.println(y);
        y = (x==20)?61:90; //condition is true, so exp1 is executed
        System.out.println(y);

    }
}
