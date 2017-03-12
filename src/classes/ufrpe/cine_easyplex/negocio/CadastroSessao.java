package classes.ufrpe.cine_easyplex.negocio;

import java.util.ArrayList;

import classes.ufrpe.cine_easyplex.beans.Filme;
import classes.ufrpe.cine_easyplex.beans.Sala;
import classes.ufrpe.cine_easyplex.beans.Sessao;
import classes.ufrpe.cine_easyplex.dados.RepositorioSessao;
import classes.ufrpe.cine_easyplex.interfaces.iRepositorioSessao;

public class CadastroSessao {
	private iRepositorioSessao repositorioSessao;
	private CadastroSessao instancia = null;
	
	private CadastroSessao() {
		this.repositorioSessao = RepositorioSessao.getInstance();
	}
	public CadastroSessao getInstance(){
		if(this.instancia==null){
			this.instancia = new CadastroSessao();
		}
		return this.instancia;
	}
	public void adicionarSessao(){
		
	}
	public void cancelarSessao(){
		
	}
	public boolean conferirHorario(){
		return true;
	}
	public ArrayList<Sessao> buscarPorFilme(Filme filme){
		ArrayList<Sessao> listaPorFilme = new ArrayList<>();
		for(int i = 0; i<this.repositorioSessao.listar().size() ;i++){
			if(this.repositorioSessao.listar().get(i).getExibicao().equals(filme)){
				listaPorFilme.add(this.repositorioSessao.listar().get(i));
			}
		}
		return listaPorFilme;
		
	}
	public ArrayList<Sessao> buscarPorSala(Sala sala){
		ArrayList<Sessao> listaPorSala = new ArrayList<>();
		for(int i = 0; i<this.repositorioSessao.listar().size() ;i++){
			if(this.repositorioSessao.listar().get(i).getHall().equals(sala)){
				listaPorSala.add(this.repositorioSessao.listar().get(i));
			}
		}
		return listaPorSala;
		
	}
	public Sessao buscarPorHorario(){
		return null;
	}

}
