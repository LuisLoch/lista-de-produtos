package br.unigran.listadecompras;

public class Compra {
    private String nomeProduto;
    private String marcaProduto;
    private String precoProduto;

    public String getNomeProduto() {return nomeProduto;}

    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public String getMarcaProduto() { return marcaProduto; }

    public void setMarcaProduto(String marcaProduto) { this.marcaProduto = marcaProduto; }

    public String getPrecoProduto() { return precoProduto; }

    public void setPrecoProduto(String precoProduto) { this.precoProduto += precoProduto; }

    public String toString() { return nomeProduto+" - "+marcaProduto+" - "+precoProduto; }
}
