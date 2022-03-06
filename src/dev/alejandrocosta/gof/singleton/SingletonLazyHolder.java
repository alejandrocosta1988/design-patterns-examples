package dev.alejandrocosta.gof.singleton;

/**
 * Singleton "armazenador".
 * Esse tipo de singleton armazena a instância em uma classe estática interna Inner Class, chamada de Holder. 
 * Tudo em um singleton tem uma controle estático.
 * @author alejandro_costa
 */
public class SingletonLazyHolder {
	
	// Classe estática interna que encapsula a instância.
	private static class InstanceHolder
	{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder(){};
	
	public static SingletonLazyHolder getInstancia()
	{
		return InstanceHolder.instancia;
	}

}
