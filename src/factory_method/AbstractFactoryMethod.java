package factory_method;

public class AbstractFactoryMethod {
	public static void main(String[] args) {
		Product product = ProductFactory.createProduct("A");
		product.printProduct();
		product = ProductFactory.createProduct("B");
		product.printProduct();
		product = ProductFactory.createProduct("C");
		product.printProduct();
			
	}
}
