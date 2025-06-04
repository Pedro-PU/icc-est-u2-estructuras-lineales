import Controllers.*;
import Models.*;
public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("tam = " + stack.size());
        stack.printStack();
        stack.pop();
        //stack.peek();
        System.out.println("tam = " + stack.size());
        stack.printStack();

        StackG<String> stackGS = new StackG<String>();
        stackGS.push("uno");
        stackGS.push("cuatro");
        System.out.println("tam = "+ stackGS.size());
        stackGS.printStack();

        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tam = " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("tam = " + cola.size);
        cola.printCola();

        System.out.println("-".repeat(50));

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiene a la persona => " + colaPersonas.remove().getNombre());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
    }
}
