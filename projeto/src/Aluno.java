public class Aluno extends Persona {
    private String dataInscricao;

    public Aluno(String id, String nome, String contato, String dataInscricao) {
        super(id, nome, contato);
        this.dataInscricao = dataInscricao;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", contato='" + getContato() + '\'' +
                ", dataInscricao='" + dataInscricao + '\'' +
                '}';
    }
}