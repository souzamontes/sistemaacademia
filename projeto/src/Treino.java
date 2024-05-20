
public class Treino {

    private String id;
    private String nome;
    private String descricao;
    private int duracao;
    private String nivelDificuldade;

    public Treino (String id, String nome, String descricao, int duracao, String nivelDificuldade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public String toString() {
        return "Treino{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                '}';
    }
}