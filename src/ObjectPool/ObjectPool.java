package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool{
	private static ObjectPool instance;
	private List<String> available;
	private List<String> inUse;
	private long maxSize;
	private long counter;
	private ObjectPool() {
		available = new ArrayList<>();
		inUse = new ArrayList<>();
		counter = 0;
	}
	public static ObjectPool getInstance(){
		if (instance == null) instance = new ObjectPool();
		System.out.println("This is Singleton");
		return instance;
	}
	 public String acquireReusable(){
		if (available.size() != 0 && available.size() < maxSize) {
			String used = available.get(0);
			inUse.add(used);
			available.remove(0);
			counter--;
			return used;
		}
		String item = "new item";
		inUse.add(item);
		return item;
	}
	 public void releaseReusable(String item) {
		if (counter < maxSize) {
			available.add(item);
			System.out.println(item);
			counter++;
			inUse.remove(item);
		}
	}
	public void setMaxSize(long maxSize) {
		this.maxSize = maxSize;
	}
}
