package proxyTest;

public class ProxyComCacheDemo {

	public static void main(String[] args) {
		Biblioteca biblioteca = new BibliotecaProxy();

        System.out.println(biblioteca.buscarLivro("Gozada"));
        System.out.println(biblioteca.buscarLivro("Clean Code"));
        System.out.println(biblioteca.buscarLivro("Gozada")); // Deve vir do cache

	}

}
