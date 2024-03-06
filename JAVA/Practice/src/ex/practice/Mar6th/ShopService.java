package ex.practice.Mar6th;

public class ShopService {
	
	private static ShopService obj = new ShopService();
	public static ShopService getInstance() {
		
		return obj;
	}
	private ShopService() {
		
	}

	
}