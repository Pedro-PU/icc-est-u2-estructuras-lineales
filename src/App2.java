import Ejercicio_01_sing.SingValidator;
import Ejercicio_02_sorting.StackSorter;
import java.util.Scanner;
import Controllers.Stack;
public class App2 {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("-".repeat(25)+"EJERCICIO 1"+"-".repeat(25));
        Scanner lector = new Scanner(System.in);
        SingValidator sV = new SingValidator();

        System.out.print("Input: ");
        String llave = lector.nextLine();
        System.out.print("Output: " + sV.isValid(llave)+"\n");
        //EJERCICIO 2
        System.out.println("-".repeat(25)+"EJERCICIO 2"+"-".repeat(25));
        StackSorter sS = new StackSorter();
        System.out.println("Ingrese la cantidad de elementos que desea ingresar: ");
        int size = lector.nextInt();
        System.out.println("Ingrese los elementos: ");
        Stack stackV = new Stack();
        for(int i = 0; i < size; i++){
            System.out.print("- ");
            int input = lector.nextInt();
            stackV.push(input);
        }
        /*
        stackV.push(2);
        stackV.push(4);
        stackV.push(1);
        stackV.push(5);
         */
        System.out.print("Input: ");
        stackV.printStack();
        System.out.print("Output: ");
        sS.sortStack(stackV);
        stackV.printStack();
    } 
    
}
