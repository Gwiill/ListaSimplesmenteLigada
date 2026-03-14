package lista;


import modelo.Produto;
public class lista {
    private No inicio,atual,aux;

    public void inserir(Produto produto){
        if(inicio==null) { //lista vazia
            inicio = new No(produto, null);
            aux = inicio;
        }else{
            atual=new No (produto, null);
            aux.setProx();
            aux=atual;
        }
    }

}
