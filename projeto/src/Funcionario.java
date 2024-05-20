public class Funcionario extends Persona {
    private String funcao;
    public Funcionario(String id, String nome, String contato, String funcao) {
        super(id, nome, contato);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + getId() + '\'' +
                ", name='" + getNome() + '\'' +
                ", contato='" + getContato() + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}