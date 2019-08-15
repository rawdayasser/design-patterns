package factory_method;

public class ProductA extends Product{
	@Override
	public void printProduct() {
		super.printProduct();
		System.out.println("This is Product A");
	}
}
