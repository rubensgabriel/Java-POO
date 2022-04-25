
package caneta;


public class Caneta {
    boolean tampa;
    float ponta;
    String cor;
    
    void status(){
        System.out.println("Cor " + cor);
        System.out.println("Ponta " + ponta);
        if(tampa==true){
            System.out.println("A caneta está tampada");
        }
        if(tampa==false){
            System.out.println("A caneta está destampada");
        }
    }
    void tampar(){
        tampa = true;
    }
    void destampar(){
        tampa = false;
    }
    void escrever(){
        if(tampa==true){
            System.out.println("Não é possível escrever");
        }else{
            System.out.println("Escrevendo");
        }
    }
    public static void main(String[] args) {
        Caneta c1, c2;
        
        c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.tampa = true;
        
        c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 0.5f;
        c2.tampa = false;
        
        c1.status();
        c1.escrever();
        c2.status();
        c2.escrever();
    }
    
}
