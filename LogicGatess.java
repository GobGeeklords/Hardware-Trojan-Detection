import java.util.Scanner;

public class LogicGatess {

    public static int andGate(int[] inputs) {
        for (int input : inputs) {
            if (input == 0) return 0; 
        }
        return 1; 
    }

    
    public static int orGate(int[] inputs) {
        for (int input : inputs) {
            if (input == 1) return 1; 
        }
        return 0; 
    }

    
    public static int notGate(int input) {
        return (input == 1) ? 0 : 1;
    }

   
    public static int xorGate(int[] inputs) {
        int result = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            result ^= inputs[i]; 
        }
        return result;
    }

    
    public static int nandGate(int[] inputs) {
        return notGate(andGate(inputs)); 
    }

   
    public static int norGate(int[] inputs) {
        return notGate(orGate(inputs)); 
    }

    
    public static void printGateResults(int[] inputs) {
        System.out.print("Inputs: ");
        for (int input : inputs) {
            System.out.print(input + " ");
        }
        System.out.println();
        
        System.out.println("AND Gate: " + andGate(inputs));
        System.out.println("OR Gate: " + orGate(inputs));
        System.out.println("XOR Gate: " + xorGate(inputs));
        System.out.println("NAND Gate: " + nandGate(inputs));
        System.out.println("NOR Gate: " + norGate(inputs));
        
   
        System.out.print("NOT Gate on each input: ");
        for (int input : inputs) {
            System.out.print(notGate(input) + " ");
        }
        System.out.println("\n");
    }

  
    public static void generateAllCombinations(int n) {
        int totalCombinations = (int) Math.pow(2, n);

        for (int i = 0; i < totalCombinations; i++) {
            int[] inputs = new int[n];

           
            for (int j = 0; j < n; j++) {
                inputs[j] = (i >> (n - j - 1)) & 1;
            }

           
            printGateResults(inputs);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();

       
        generateAllCombinations(n);
        
        scanner.close();
    }
}
