package designpattern.abstractfactory;

public class Demo {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "1TB", "core i7"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("64GB", "10TB", "core i11"));
		
		System.out.println("PC config : "+pc);
		System.out.println("Server config : "+server);
	}

}
