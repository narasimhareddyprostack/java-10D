package defaultex;

public class UserImplTwo implements UserDao{

	@Override
	public void login() {
		System.out.println("Login Successfully");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout Successfully");
		
	}

	public static void main(String[] args) {
		UserDao	u1=new UserImplTwo();
		u1.login();
		u1.logout();
		u1.getUserInfo();
	}

}
