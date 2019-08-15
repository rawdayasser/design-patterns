package Abstract_factory;

public class FactoryA implements AbstractFactory{
	public FactoryA() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Product1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1A();
	}

	@Override
	public Product2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2A();
	}
	
}
