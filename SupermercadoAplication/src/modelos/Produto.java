/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Cleuton
 */
public class Produto {
    
    private String nome;
    private float preco;
    private int codProduto;
    private String notaFiscal;
    private float valorNota;
    private float valorUnitRevenda;
    private String undPesoMedida;
    private String descricao;
    private float totalVenda;
    private int quantidade;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public float getValorNota() {
        return valorNota;
    }

    public void setValorNota(float valorNota) {
        this.valorNota = valorNota;
    }

    public float getValorUnitRevenda() {
        return valorUnitRevenda;
    }

    public void setValorUnitRevenda(float valorUnitRevenda) {
        this.valorUnitRevenda = valorUnitRevenda;
    }

    public String getUndPesoMedida() {
        return undPesoMedida;
    }

    public void setUndPesoMedida(String undPesoMedida) {
        this.undPesoMedida = undPesoMedida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public String getNome(){
        return nome;
        
    }
    
    public void setPreco(float novopreco){
        this.preco= novopreco;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
}

