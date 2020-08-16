package colecoes;

import java.util.Map;
import java.util.TreeMap;

public class Mapa {

    public static void main(String[] args) {
        Map<String, String> produtos = new TreeMap<>();

        produtos.put("Carro", "Palio");
        produtos.put("Relógio","MountBlanc");
        produtos.put("Smartphone", "Xiaomi");
        produtos.put("Guitarra", "Fender");

       // produtos.remove("Carro"); // Remove uma chave do conjunto

        System.out.println(produtos);
        System.out.println(produtos.size());
        System.out.println(produtos.keySet()); //Exibe o conjunto de chaves
        System.out.println(produtos.values()); // Valores das chaves
        System.out.println(produtos.entrySet()); // Exibe registros completos {chave/valor}
        System.out.println(produtos.containsValue("Palio"));
        System.out.println(produtos.containsKey("Moto"));
    }
}
