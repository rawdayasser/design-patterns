package Abstract_factory;
/**
 * @author Rawda Yasser
 * 
 */
/**
 * 
 * Abstract Factory is a creational design pattern 
 * used to create families of related objects without typing the new keyword
 */
public class AbstractFactoryMain {
	public static void main(String[] args) {
		AbstractFactory factory = new FactoryA();
		Product1 product1A = factory.createProduct1();
		product1A.say();
		Product2 product2A = factory.createProduct2();
		product2A.say();
		factory = new FactoryB();
		Product1 product1B = factory.createProduct1();
		product1B.say();
		Product2 product2B = factory.createProduct2();
		product2B.say();
	}
}
