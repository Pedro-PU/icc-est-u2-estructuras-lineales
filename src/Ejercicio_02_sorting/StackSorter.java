package Ejercicio_02_sorting;
import Controllers.Stack;
public class StackSorter {
    public void sortStack(Stack stack){
        Stack stackAux = new Stack();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!stackAux.isEmpty() && stackAux.peek() > temp) {
                stack.push(stackAux.pop());
            }
            stackAux.push(temp);
        }
        while (!stackAux.isEmpty()) {
            stack.push(stackAux.pop());
        }

    }
}
