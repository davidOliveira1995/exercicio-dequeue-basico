public class Tarefa {

    private String descricao;
    private long timestamp;

    public Tarefa(String descricao, long timestamp) {
        this.descricao = descricao;
        this.timestamp = timestamp;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao +"\n";
    }
}
