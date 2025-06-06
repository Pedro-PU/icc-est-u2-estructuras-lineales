package Controllers;
import Models.NodeGeneric;


import java.util.EmptyStackException;

public class ColaG<T> {
    private NodeGeneric<T> inicio;
    private NodeGeneric<T> fin;
    private int size;

    public ColaG() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            inicio = newNode;
            fin = newNode;
        } else {
            fin.setNext(newNode);
            fin = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        T value = inicio.getValue();
        inicio = inicio.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return inicio.getValue();
    }

    public T findByName(String nombre) {
        NodeGeneric<T> actual = inicio;
        while (actual != null) {
            T valor = actual.getValue();
            if (valor instanceof Models.Persona) {
                Models.Persona persona = (Models.Persona) valor;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    return valor;
                }
            }
            actual = actual.getNext();
    }
        return null;
    }

    public T removeByName(String nombre) {
        if (isEmpty()) return null;

        NodeGeneric<T> actual = inicio;
        NodeGeneric<T> anterior = null;

        while (actual != null) {
            T valor = actual.getValue();
            if (valor instanceof Models.Persona) {
                Models.Persona persona = (Models.Persona) valor;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    // Caso: eliminar el primero
                    if (actual == inicio) {
                        inicio = inicio.getNext();
                        if (inicio == null) fin = null;
                    } else {
                        anterior.setNext(actual.getNext());
                        if (actual == fin) fin = anterior;
                    }
                    size--;
                    return valor;
                }
            }
            anterior = actual;
            actual = actual.getNext();
        }
        return null;
    }


    public void printCola() {
        NodeGeneric<T> current = inicio;
        while (current != null) {
            System.out.print(current.getValue() + " | ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
