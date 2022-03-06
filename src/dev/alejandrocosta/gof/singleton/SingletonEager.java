package dev.alejandrocosta.gof.singleton;

/**
 * Singleton "apressado".
 * A instância já será disponibilizada em um primeiro momentos para o usuário.
 * @author alejandro_costa
 */
public class SingletonEager {
	
	// Nesse tipo de singleton, a instância já será criada.
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager(){};

	public static SingletonEager getInstancia()
	{
		return instancia;
	}

}
