package ObjectPool;

public class Main {

	public static void main(String[] args) {
		ObjectPool objectPool = ObjectPool.getInstance();
		objectPool.setMaxSize(10);
		String reusable = objectPool.acquireReusable();
		System.out.println(reusable);
		objectPool.releaseReusable(reusable);
		System.out.println(objectPool.acquireReusable());
	}

}
