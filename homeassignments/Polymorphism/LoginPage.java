package homeassignments.Polymorphism;

public class LoginPage extends BasePage{
	@Override
	public void performCommonTasks() {
		clearText();
	} 
	public void clearText()
	{
		System.out.println("Clear the placeholder in the text field");
	}
	public static void main(String[] args) {
		LoginPage exe = new LoginPage();
		exe.findElement();
		exe.clickElement();
		exe.clearText();
		exe.enterText();
	}

}
