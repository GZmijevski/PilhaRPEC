import java.util.Stack;

public class pilha1 {
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();

        
        pilha.push(777);
        pilha.push(7);
        pilha.push(77);

        
        System.out.println("Topo da pilha: " + pilha.peek());

        
        System.out.println("Removido: " + pilha.pop());

        
        System.out.println("Novo topo da pilha: " + pilha.peek());


        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("A pilha ainda tem elementos.");
        }

        System.out.println("Elementos da pilha: " + pilha);
    }
}
