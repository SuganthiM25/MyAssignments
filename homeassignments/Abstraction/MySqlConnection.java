package homeassignments.Abstraction;

public abstract class MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connect to the Database");
			}

	@Override
	public void disconnect() {
		System.out.println("Disconnect from the Database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Run the updates");	
	}

	public abstract void executequery();
}
