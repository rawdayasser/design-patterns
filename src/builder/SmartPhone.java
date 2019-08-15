package builder;

public class SmartPhone {
	private String ram;
	private String cpu;
	private String hardDisk;
	private String camera;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	@Override
	public String toString() {
		String str = this.ram + " " + this.cpu + " " 
				+ this.camera + " " + this.hardDisk + "\n";
		return str;
	}
}
