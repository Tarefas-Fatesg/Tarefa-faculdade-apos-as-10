
import java.util.Random;


public class TestePilha {
    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        Random ale = new Random();
        NumerosInteiros num;
        for (int i = 0; i < 100; i++) {
            p1.empilhar(new NumerosInteiros(ale.nextInt(1001)));
        }
        p1.imprimirPilha();
//        System.out.println("\n");
//        for (int i = 0; i < 12; i++) {
//            num = p1.desempilhar();
//            if(num != null)
//                System.out.println("desempilhou: "+num.getNumero());
//            else{
//                System.out.println("Pilha vazia");
//            }
//        }
//        p1.empilhar(new NumerosInteiros(5));
//        System.out.println("Topo: "+p1.topoDaPilha());
    }
}
