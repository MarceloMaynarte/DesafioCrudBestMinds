public class Crud {
    import java.util.*;

class Produto {
    String nome;
    int codigo;
    String descricao;
    double preco;

    // Construtor
    public Produto(String nome, int codigo, String descricao, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos getters e setters
    // ...
}

class Loja {
    List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    // Create
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Read
    public Produto obterProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                return produto;
            }
        }
        return null;
    }

    // Update
    public void atualizarProduto(int codigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).codigo == codigo) {
                produtos.set(i, novoProduto);
                break;
            }
        }
    }

    // Delete
    public void removerProduto(int codigo) {
        produtos.removeIf(produto -> produto.codigo == codigo);
    }
}
}
