
package supermercado;


public class Produto {
    String nome;
    double peso, preco;
    
    void informacoes(){
        System.out.println("Nome " + nome);
        System.out.println("Peso " + peso);
        System.out.println("Preço " + preco);
    }
    void vender(){
        System.out.println("O produto " + nome + " foi vendido");
    }
    void pesar(){
        if(peso>10){
            System.out.println("ERRO! Produdo acima de 10kg");
        }
        else{
            System.out.println("Peso " + peso);
        }
    }
    void desconto(double desc){
        double novopreco;
        novopreco = preco-(preco*(desc/100));
        preco = novopreco;
    }
    public static void main(String[] args) {
        Produto p1, p2;
        
        p1 = new Produto();
        p1.nome = "Arroz Prato Fino";
        p1.peso = 10f;
        p1.preco = 9.50f;
        
        p2 = new Produto();
        p2.nome = "Picanha";
        p2.peso = 1f;
        p2.preco = 23f;
        
        p1.informacoes();
        p2.informacoes();
        p1.vender();
        p2.vender();
        p2.desconto(10);
        System.out.println("O valor total de compra destes produtos é " + (p1.preco + p2.preco));
    }
    
    
}
