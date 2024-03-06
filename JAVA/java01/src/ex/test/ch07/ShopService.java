package ex.test.ch07;

public class ShopService {
	private static ShopService s = new ShopService ();
	
	public static ShopService getInstance() {
		return s;
	}
	private ShopService() {
		
	}
}
