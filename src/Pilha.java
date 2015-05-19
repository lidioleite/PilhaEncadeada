
public class Pilha implements interfacePilhaEncadeada {

    public int[] vetor;
    public int ponteiro;

    public Pilha(int ponteiro) {
        this.vetor = new int[5];
        this.ponteiro = 0;
    }

    public boolean eVazia() //verifica se a pilha possui elementos 
    {
        if (this.ponteiro == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int tamanho()//retorna o número de itens da pilha 
    {
        if (this.eVazia()) {
            return 0;
        } else {
            return this.ponteiro;
        }

    }

    public void limpar()//esvaziar pilha  
    {
        this.vetor = new int[5];
        this.ponteiro = 0;
    }

    public void push(int valor) //insere um valor no topo da pilha  
    {
        if (ponteiro < 5) {
            for (int i = this.ponteiro; i < 0; i--) {
                vetor[i] = vetor[i - 1];

            }
        }
        vetor[0] = valor;

        this.ponteiro += 1;

    }

    public void pop() //retira o valor no topo da pilha  
    {
        if (ponteiro > 0) {
            vetor[this.ponteiro] =0;
        }

        this.ponteiro -= 1;
    }

    public int pegarTopo()//retorna o valor atual do topo da pilha 
    {
        if (!this.eVazia()) {
            return vetor[this.ponteiro];
        }
        return 0;
    }

    public void listar()//retorna os elementos da pilha
    {

    }

}
