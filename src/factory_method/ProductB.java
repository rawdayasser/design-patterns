package factory_method;

public class ProductB extends Product{
	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("This is Product B");
	}
}
