package carro;

import componente.Motor;
import componente.RelacionesDiferenciales;
import componente.Suspension;

public class CarroGasolina extends Carro {

	//Inyección de Dependencias
	
	//Inmutabilidad
	private final Motor motor;
    private final RelacionesDiferenciales relacionesDiferenciales;
    private final Suspension suspension;

    //Composición
    public CarroGasolina(Motor motor, RelacionesDiferenciales relacionesDiferenciales, Suspension suspension) {
    	this.motor = motor;
    	this.relacionesDiferenciales = relacionesDiferenciales;
    	this.suspension = suspension;
    	
		System.out.println("Carro de Gasolina");
    }
    
	@Override
	public void tipoCarroOffRoad() {
		motor.tipo();
		relacionesDiferenciales.tipo();
		suspension.tipo();		
		System.out.println();
	}
}
