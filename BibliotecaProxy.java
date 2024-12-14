package proxyTest;

import java.util.HashMap;
import java.util.Map;

public class BibliotecaProxy implements Biblioteca {
    private BibliotecaReal bibliotecaReal;
    private Map<String, String> cache;

    public BibliotecaProxy() {
        this.bibliotecaReal = new BibliotecaReal();
        this.cache = new HashMap<>();
    }

    @Override
    public String buscarLivro(String titulo) {
        if (cache.containsKey(titulo)) {
            System.out.println("Retornou o livro do cache: " + titulo);
            return cache.get(titulo);
        }

        String conteudo = bibliotecaReal.buscarLivro(titulo);
        cache.put(titulo, conteudo);
        return conteudo;
    }
}
