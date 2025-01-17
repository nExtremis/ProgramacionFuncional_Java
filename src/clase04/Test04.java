package clase04;

public class Test04 {
    public static  void main(String[] args) {

        ejecutorTipo1( ()->System.out.println("Hola mundo!"));
        ejecutorTipo2((a)-> System.out.println(a),2);
        ejecutorTipo3( (a,b) -> System.out.println(a+b),2,3);
        ejecutorTipo4(()->{
            int a = 2;
            int b = 4;
            int c = a+b ;
            return c;
        });
        ejecutorTipo5((a,b)->(int)Math.pow(a,b),4,6);

    }

    public static void ejecutorTipo5(IFuncional5 f, int a , int b){

        int resultado = f.metodo5(a,b);
        System.out.println(resultado);
    }

    public static void ejecutorTipo1(IFuncional1 f){
        f.metodo1();
    }

    public static void ejecutorTipo2(IFuncional2 f, int a){
        f.metodo2(a);
    }
    public static void ejecutorTipo3(IFuncional3 f, int a, int b){
        f.metodo3(a,b);
    }
    public static void ejecutorTipo4(IFuncional4 f){
        int resultado = f.metodo4();
        System.out.println(resultado);
    }
}
