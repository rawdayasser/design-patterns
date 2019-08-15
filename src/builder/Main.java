package builder;

public class Main {
	public static void main(String[] args) {
		PhoneCreator phoneCreator = new PhoneCreator();
		SmartPhone phone = phoneCreator.createPhone(new SamsungPhoneBuilder(), new String[]{"cpu_", "ram_", "camera_", "hardDisk_"});
		System.out.println(phone);
	}
}
