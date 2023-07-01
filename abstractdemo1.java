package abstractdemo;

public class abstractdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		abstractclass1 a1 = new login();
		a1.loginusername();
		a1.loginpassword();
		
		System.out.println("      ");

		login l = new login();
		l.loginusername();
		l.loginpassword();
		
		System.out.println("       ");
		
		logininterface lg = new logininterface();
		lg.loginusername();
		lg.loginpassword();

	}
}