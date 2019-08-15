package Abstract_factory;

public class FactoryB implements AbstractFactory{
public FactoryB() {
	// TODO Auto-generated constructor stub
}
	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1B();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2B();
	}
	
}
