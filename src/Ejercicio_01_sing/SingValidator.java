package Ejercicio_01_sing;
import Controllers.StackG;
public class SingValidator {
    StackG<Character> stackG = new StackG<Character>();
    public boolean isValid(String cadena){
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '['){
                stackG.push(cadena.charAt(i));
            } else if(cadena.charAt(i) == ')' || cadena.charAt(i) == '}' || cadena.charAt(i) == ']'){
                if(stackG.isEmpty()){
                    return false;
                }
                if ((cadena.charAt(i) == ')' && stackG.peek() == '(') ||
                    (cadena.charAt(i) == '}' && stackG.peek() == '{') ||
                    (cadena.charAt(i) == ']' && stackG.peek() == '[')) {
                    stackG.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
