
public interface interfacePilhaEncadeada {

    boolean eVazia(); //verifica se a pilha possui elementos 

    int tamanho();//retorna o número de itens da pilha 

    void limpar();//esvaziar pilha  

   void  push(int valor); //insere um valor no topo da pilha  

    void pop(); //retira o valor no topo da pilha  

    int pegarTopo();//retorna o valor atual do topo da pilha 

    void listar();//retorna os elementos da pilha
}
