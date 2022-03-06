package dev.alejandrocosta.gof.abstractfactory;

public class ComputerFactoryTwo 
{
	public static Computer getComputer(ComputerAbstractFactory factory)
	{
		return factory.createComputer();
	}
}
