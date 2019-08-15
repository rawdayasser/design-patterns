package builder;

public interface SmartPhoneAbstractBuilder {
	public void addRam(String ram);
	public void addCpu(String cpu);
	public void addCamera(String camera);
	public void addHardDisk(String hardDisk);
	public SmartPhone build();
}
