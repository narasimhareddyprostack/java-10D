package defaultex;

public interface UserDao {
	public abstract void login();
	public abstract	void logout();
	//void forgetPassword();
	default void getUserInfo() {
		System.out.println("Displaying user Details");
	}
}
