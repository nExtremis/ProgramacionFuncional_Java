package clase03;

import clase03.Operator;

public class Test03{
    public static  void main(String[] args) {



        System.out.println(ejecutarOp(1,2,(a,b)-> a+b));
        System.out.println(ejecutarOp(1F,2F,(a,b)-> a/b));
    }
    public static <T extends Number> T ejecutarOp(T a, T b, Operator<T> operador){
        return operador.apply(a,b);
    }
}
