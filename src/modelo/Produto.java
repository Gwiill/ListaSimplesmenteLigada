package modelo;

public class Produto {
    private String nome;
    private double preco;
    private int id;

    // Atributo estático para controlar o próximo ID disponível
    private static int contadorId = 1;

    // Construtor 1: Completo
    public Produto(String nome, double preco) {
        this.id = contadorId++; // Atribui o valor atual e depois incrementa
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor 2: Padrão/Vazio (útil para frameworks e flexibilidade)
    public Produto() {
        this.id = contadorId++;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    // O ID geralmente não possui 'set' manual por ser auto-incremento,
    // mas se precisar forçar um valor, aqui está:
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // --- ToString ---

    @Override
    public String toString() {
        return String.format("Produto [ID: %d | Nome: %s | Preço: R$ %.2f]",
                id, nome, preco);
    }
}
