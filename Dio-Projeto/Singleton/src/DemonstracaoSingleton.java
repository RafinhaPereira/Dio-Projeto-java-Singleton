

public class DemonstracaoSingleton {
    public static void main(String[] args) {
        // Obtendo a instância Singleton
        Singleton singleton = Singleton.getInstance();

        // Chamando um método da instância Singleton
        singleton.showMessage();
    }
}
