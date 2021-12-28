package br.com.alfaloja.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)//Para poder usar o autoincremento.
	private Long idproduto;
	private String codigo;
	private String nome;
	private String descricao;
	private String destaque;
	private Float valor;
	
	//Métodos Getters and Setters.
	public Long getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getDestaque() {
		return destaque;
	}
	public void setDestaque(String destaque) {
		this.destaque = destaque;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	//Métodos hashCode and equals, neste caso somente para "idproduto".
	@Override
	public int hashCode() {
		return Objects.hash(idproduto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(idproduto, other.idproduto);
	}	
}