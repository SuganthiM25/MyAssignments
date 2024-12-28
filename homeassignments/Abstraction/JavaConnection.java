package homeassignments.Abstraction;

public class JavaConnection extends MySqlConnection {
	
	@Override
	public void executequery() {
		System.out.println("Exceute the Query");
	}
	public static void main(String[] args) {
		
		JavaConnection exe = new JavaConnection();
		exe.connect();
		exe.executeUpdate();
		exe.executequery();
		exe.disconnect();
			}
		
	}
