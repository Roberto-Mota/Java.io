package Projeto.src.testes;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */

public class Cliente implements Serializable{

	// versão dessa classe para futura leituras (deve ser a mesma versão para ler com sucesso)
	// Existem mudanças que são compatíveis e que nao precisam mudar a versão, vai depender do que foi mudado,
	// e.g. mudar cpf pra int vai quebrar tudo, precisando mudar a versão, já mudar um setCpf com regras não necessariamente

	// A serialização precisa ser feita nas classes mães, e se a classe tiver, como atributo, outras classes,
	// essas também precisam ser serializadas, ou receber em sua assinatura a palavra chave "transient", que faz com que
	// esse objeto não seja gravado no bin
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
