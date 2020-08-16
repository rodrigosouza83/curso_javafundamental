package entitie;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Rodrigo");
        fila.offer("Suellen");

        System.out.println(fila.peek());
        System.out.println(fila.isEmpty());
        System.out.println(fila.element());
        System.out.println(fila.size());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }

}
