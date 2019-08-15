package builder;

import java.util.List;

public class PhoneCreator {
	public SmartPhone createPhone(SmartPhoneAbstractBuilder builder, String[] options) {
		builder.addCpu(options[0]);
		builder.addRam(options[1]);
		builder.addCamera(options[2]);
		builder.addHardDisk(options[3]);
		SmartPhone phone = builder.build();
		return phone;
	}
}
