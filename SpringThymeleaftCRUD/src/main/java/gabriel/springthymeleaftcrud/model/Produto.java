package gabriel.springthymeleaftcrud.model;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true, nullable=false, length=100)
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String imagem;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
