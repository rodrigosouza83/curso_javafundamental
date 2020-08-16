package entitie;

public class CompareProgram {

    public static void main(String[] args) {

    Client c1 = new Client("Rodrigo", "rodrigo@gmail.com");
    Client c2 = new Client("Rodrigo", "rodrigoc@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); //Vai dar sempre falso, pois a alocação de memória é diferente entre c1 e c2

    }
}
