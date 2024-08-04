package aula01_Desk;

public class Estoque {

    // Atributos encapsulados
    private int codigo;
    private String descricao;
    private int estoque;

    // Método construtor
    public Estoque(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estoque = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    // Método para incluir estoque
    public int incluir(int estoque) {
        return this.estoque += estoque;
    }

    // Método para retirar estoque
    public boolean retirar(int estoque) {
        if (this.estoque >= estoque) {
            this.estoque -= estoque;
            return true;
        }
        return false;
    }

    // Método para consultar o estoque
    public String consultarProduto() {
        return "Estoque [codigo=" + codigo + ", descricao=" + descricao + ", estoque=" + estoque + "]";
    }
}
