package proxyTest;

public class BibliotecaReal implements Biblioteca {
    @Override
    public String buscarLivro(String titulo) {
        System.out.println("Buscando livro na biblioteca real: " + titulo);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("A thread foi interrompida!");
		}
        return "FQR o conteúdo do livro: " + titulo;
        // FQR = Finge que retornou
    }
}