package motor;

import componente.Motor;

public class MotorDiesel implements Motor {

	//Sobreescritura
	@Override
	public void tipo() {
		
		System.out.println("Motor Diesel");
		
	}

}
