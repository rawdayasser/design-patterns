package factory_method;

public class ProductFactory {
	public static Product createProduct(String type) {
		switch (type) {
		case "A":
			return new ProductA();
		case "B":
			return new ProductB();		
		case "C":
			return new ProductC();
		}
		return null;
	}
}
