package builder;

public class SamsungPhoneBuilder implements SmartPhoneAbstractBuilder{
	private SamsungPhone samsungPhone;
	public SamsungPhoneBuilder() {
		samsungPhone = new SamsungPhone();
	
	}
	@Override
	public void addRam(String ram) {
		samsungPhone.setRam(ram);
	}

	@Override
	public void addCpu(String cpu) {
		samsungPhone.setCpu(cpu);
	}

	@Override
	public void addCamera(String camera) {
		samsungPhone.setCamera(camera);
	}

	@Override
	public void addHardDisk(String hardDisk) {
		samsungPhone.setHardDisk(hardDisk);
	}
	
	public SamsungPhone build() {
		return samsungPhone;
	}

}
