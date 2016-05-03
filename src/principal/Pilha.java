
public class Pilha {
    private NumerosInteiros topo;
    
    //cria um pilha vazia
    public Pilha(){
        topo = null;
    }
    // verifica se pilha esta vazia
    public boolean vazia(){
        return topo == null;
    }
    //retorna o elemento do topo da pilha (sem remover)
    public NumerosInteiros topoDaPilha(){
        return topo;
    }
    //empilhar ==> inserir um elemento na pilha
    public void empilhar(NumerosInteiros numero){
        
        if(!vazia())
            numero.setProximo(topo);
        
        topo = numero;
    }
    
    //desempilhar ==> remove o elemento do topo
    public NumerosInteiros desempilhar(){
        if(vazia()){
            return null;
        }
        NumerosInteiros retorno = topo;
        topo = topo.getProximo();
        retorno.setProximo(null);
        return retorno;
    }
    //ordena utilizando pilha
    public Pilha ordena(Pilha p1){
        Pilha aux = new Pilha();
        Pilha def = new Pilha();
        //...
        // é com voces
        
        return def;
    }
    //mostra os elementos da pilha
    public void imprimirPilha(){
        if(vazia())
            System.out.println("Pilha vazia");
        else{
            System.out.println("elementos da pilha");
            NumerosInteiros aux = topo;
            int i=0;
            while(aux != null){
                if(i%10 == 0)
                    System.out.println("");
                System.out.print(aux+"\t");
                aux = aux.getProximo();
                i++;
            }
            System.out.println("");
        }
    }
}
