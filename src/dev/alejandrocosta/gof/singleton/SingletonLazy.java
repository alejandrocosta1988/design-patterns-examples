package dev.alejandrocosta.gof.singleton;

/**
 * Singleton "preguiçoso".
 * Esse tipo de singleton não disponibiliza uma instância para o usuário no primeiro momento.
 * @author alejandro_costa
 */
public class SingletonLazy 
{
	// Um singleton tem uma instância dele mesmo.
	private static SingletonLazy instancia;
	
	// O construtor tem que ser private, pois ninguém de fora pode criar uma instância.
	private SingletonLazy(){};
	
	// Método para criação de uma instância. Primeiro será verificado se a instância já existe. Se não, ela será criada e retornada.
	public static SingletonLazy getInstancia()
	{
		if ( instancia == null )
		{
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
