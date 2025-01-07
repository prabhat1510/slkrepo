package designpattern.proxy;

public class Demo {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Raj", "password1");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
