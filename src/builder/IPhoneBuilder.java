package builder;

public class IPhoneBuilder implements SmartPhoneAbstractBuilder{
	private IPhone iPhone;
	public IPhoneBuilder() {
		iPhone = new IPhone();	
	}
	@Override
	public void addRam(String ram) {
		iPhone.setRam(ram);
	}

	@Override
	public void addCpu(String cpu) {
		iPhone.setCpu(cpu);
	}

	@Override
	public void addCamera(String camera) {
		iPhone.setCamera(camera);
	}

	@Override
	public void addHardDisk(String hardDisk) {
		iPhone.setHardDisk(hardDisk);
	}
	public IPhone build() {
		return iPhone;
	}
	
}
