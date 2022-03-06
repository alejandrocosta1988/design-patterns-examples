package dev.alejandrocosta.gof.abstractfactory;

/**
 * Exemplo de implementação do design patter Abstract Factory.
 * É como uma Factory, mas seria uma fábrica de fábricas.
 * Os blocos if-else ou switch do padrão Factory são eliminados. Uma subclasse vai ser retornada com base no input de fábrica. Precisamos de uma classe Factory para cada subclasse.
 * A AbstractFactory pode ser uma classe abstrata ou uma interface. As classes Factory irão implementar o método da AbstractFactory.
 * Será necessário também uma consumer class que irá fornecer o ponto de entrada para que as classes cliente possam criar subclasses. Nesse exemplo será a ComputerFactory.
 * @author alejandro_costa
 */
public interface ComputerAbstractFactory 
{
	public Computer createComputer();
}
