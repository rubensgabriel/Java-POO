public class Exercicio {

    public static void main(String[] args) {
        String arg1, arg2;
        arg1 = args[0];
        arg2 = args[1];
        
        int num1 = Integer.parseInt(arg1);
        int num2 = Integer.parseInt(arg2);
        
        System.out.print("ADIÇÃO: " + (num1 + num2)");
        System.out.print("\nSUBTRAÇÃO: " + (num1 - num2));
        System.out.print("\nMULTIPLICAÇÃO: " + (num1 * num2));
        System.out.print("\nDIVISÃO: " + (num1 / num2));
    }
    
}