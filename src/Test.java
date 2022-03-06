import dev.alejandrocosta.gof.abstractfactory.*;
import dev.alejandrocosta.gof.facade.Facade;
import dev.alejandrocosta.gof.factory.Computer;
import dev.alejandrocosta.gof.factory.ComputerFactory;
import dev.alejandrocosta.gof.singleton.SingletonEager;
import dev.alejandrocosta.gof.singleton.SingletonLazy;
import dev.alejandrocosta.gof.singleton.SingletonLazyHolder;
import dev.alejandrocosta.gof.strategy.Comportamento;
import dev.alejandrocosta.gof.strategy.ComportamentoAgressivo;
import dev.alejandrocosta.gof.strategy.ComportamentoDefensivo;
import dev.alejandrocosta.gof.strategy.ComportamentoNormal;
import dev.alejandrocosta.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Testes do Design Pattern Singleton
		System.out.println("--".repeat(10) + "Testes do padrão Singleton" + "--".repeat(10));
		System.out.println();
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		// A instância retornada deverá ser a mesma
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Strategy" + "--".repeat(10));
		System.out.println();
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Facade" + "--".repeat(10));
		System.out.println();
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "40512378523");

		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Factory" + "--".repeat(10));
		System.out.println();
		
		Computer pc = ComputerFactory.getComputer("pc", "4 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Configuração do PC criado: " + pc);
		System.out.println("Configuração do Servidor criado: " + server);

		System.out.println();
		System.out.println("--".repeat(10) + "Testes do padrão Abstract Factory" + "--".repeat(10));
		System.out.println();
		
		dev.alejandrocosta.gof.abstractfactory.Computer pc2 = ComputerFactoryTwo.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		dev.alejandrocosta.gof.abstractfactory.Computer server2 = ComputerFactoryTwo.getComputer(new ServerFactory("16 GB", "2 TB", "3.4 GHz"));
		System.out.println("Configuração do PC criado: " + pc2);
		System.out.println("Configuração do Servidor criado: " + server2);
		
	}

}
