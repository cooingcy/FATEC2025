import javax.swing.JOptionPane;

public class Pilha {
    int inicio;
    int topo = -1;
    int tamanho;
    int qntdEelementos = 0;
    int p[];

    public Pilha(){
        inicio = fim = -1;
        tamanho = 10;
        p = new int[tamanho];
        qntdEelementos = 0;
    }

    public boolean estaVazia() {
        if (qntdEelementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {
        if (qntdEelementos == tamanho) {
            return true;
        }
        return false;
    }

    public void empilha(int e){
        if(!estaCheia()){
            if(inicio == -1){
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qntdEelementos++;
        }
    }

    public int desenpilha(){
        if(!estaVazia()){
            int x = p[topo];
            topo--;
            qntdEelementos --;
        }
        return x;
    }

    public void mostrar(){
        String elementos = "";
        for(int i = topo; i>=0; i--){
            elementos += p[i] + "  -  ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }
}