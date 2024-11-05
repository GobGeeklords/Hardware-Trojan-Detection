import java.util.Random;

public class LogicGates {
    
    
    public static int andGate(int input1, int input2) {
        return (input1 == 1 && input2 == 1) ? 1 : 0;
    }

    public static int orGate(int input1, int input2) {
        return (input1 == 1 || input2 == 1) ? 1 : 0;
    }

    public static int notGate(int input) {
        return (input == 1) ? 0 : 1;
    }
 
    public static int xorGate(int input1, int input2) {
        return (input1 != input2) ? 1 : 0;
    }
   
    public static int nandGate(int input1, int input2) {
        return (input1 == 1 && input2 == 1) ? 0 : 1;
    }
  
    public static int norGate(int input1, int input2) {
        return (input1 == 0 && input2 == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int input1 = rand.nextInt(2); 
        int input2 = rand.nextInt(2); 

        System.out.println("Inputs: (" + input1 + ", " + input2 + ")");
        System.out.println("AND Gate: " + andGate(input1, input2));
        System.out.println("OR Gate: " + orGate(input1, input2));
        System.out.println("NOT Gate : " + notGate(input1));
        System.out.println("XOR Gate: " + xorGate(input1, input2));
        System.out.println("NAND Gate: " + nandGate(input1, input2));
        System.out.println("NOR Gate: " + norGate(input1, input2));
    }
}
