public class Singleton {

    // A instância única da classe Singleton
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private Singleton() {
    }

    // Método estático para obter a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos da classe Singleton
    public void showMessage() {
        System.out.println("Exemplo de Singleton");
    }
}
