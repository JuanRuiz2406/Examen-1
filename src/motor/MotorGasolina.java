package motor;

import componente.Motor;

public class MotorGasolina implements Motor {

	//Sobreescritura
	@Override
	public void tipo() {
		
		System.out.println("Motor Gasolina");
		
	}

}
