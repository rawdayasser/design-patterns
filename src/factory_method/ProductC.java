package factory_method;

public class ProductC extends Product{
	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("This is Product C");
	}
}
