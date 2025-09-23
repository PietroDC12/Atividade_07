public class ProdutoIdentificavel implements Identificavel<Integer> {
    private Integer id;
    private String nome;

    public ProdutoIdentificavel(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() { return id; }
    public String getNome() { return nome; }
}
