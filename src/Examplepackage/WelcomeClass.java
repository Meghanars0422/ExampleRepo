package Examplepackage;

public class WelcomeClass {

	public void displayName() {
		System.out.println("Welcome to LookedMe");
		System.out.println("By Meg");
	}
	
	public static void main(String args[]) {
		WelcomeClass welcome = new WelcomeClass();
		welcome.displayName();
		
		MenuDrivenProg menu = new MenuDrivenProg();
		menu.menuList();
	}
}
