package br.com.dextraining.service;

import java.util.Date;
import java.util.List;

import br.com.dextraining.domain.Produto;
import br.com.dextraining.domain.Venda;
import br.com.dextraining.domain.query.VendaAcumuladaData;

public interface VendaService {

	public abstract void salvar(Venda venda);

	public abstract List<Venda> buscarVendasDoFuncionario(Long funcionarioId);

	public abstract List<Venda> buscarVendasParaCliente(Long clienteId);

	public abstract List<Venda> buscarVendasDoProduto(Produto produto);

	public abstract List<VendaAcumuladaData> buscarVendaAcumuladas(Date inicio, Date fim);

	public abstract Venda buscarPorId(Long id);

	public abstract void remover(Venda buscarPorId);

}