import java.util.*;

public class RandomNumbers {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int min = -10000000;
        int max = 10000000;
        int numCount = 1000000;
        
        // Se Generan Numeros Randon
        int[] randomNumbers = new int[numCount];
        for (int i = 0; i < numCount; i++) {
            randomNumbers[i] = random.nextInt(max - min + 1) + min;
        }
        
        // Opción de la Pila
        Stack<Integer> stack = new Stack<>();
        long startStackTime = System.currentTimeMillis();
        for (int num : randomNumbers) {
            stack.push(num);
        }
        while (!stack.empty()) {
            stack.pop();
        }
        long endStackTime = System.currentTimeMillis();
        System.out.println("Tiempo tomado por la pila: " + (endStackTime - startStackTime) + " ms");
        
        // opción de la Cola
        Queue<Integer> queue = new LinkedList<>();
        long startQueueTime = System.currentTimeMillis();
        for (int num : randomNumbers) {
            queue.offer(num);
        }
        while (!queue.isEmpty()) {
            queue.poll();
        }
        long endQueueTime = System.currentTimeMillis();
        System.out.println("Tiempo tomado por la cola: " + (endQueueTime - startQueueTime) + " ms");
        
    }
}
