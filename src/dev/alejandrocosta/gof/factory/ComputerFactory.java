package dev.alejandrocosta.gof.factory;

/**
 * O design patter Factory é utilizado quando existe uma super classe que contém múltiplas subclasses, e a partir dos inputs, uma das subclasses é retornada.
 * A super classe pode ser abstrata, normal ou uma interface.
 * @author alejandro_costa
 */
public class ComputerFactory 
{
	//factory method
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if (("Server").equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		return null;
	}
}
