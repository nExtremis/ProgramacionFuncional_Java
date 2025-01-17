import clase06.Function;

public class Test06{
    public static  void main(String[] args) {

        Function<Integer,Integer> square = n ->  n*n;
        Function<Integer,Integer> cube = n ->n *n *n ;

        System.out.println(applyFunction(square,2));
        System.out.println(applyFunction(square,3));

    }
    public static Integer applyFunction(Function<Integer,Integer> f, int t){
        return f.apply(t);
    }

}

