package carro;

import componente.Motor;
import componente.RelacionesDiferenciales;
import componente.Suspension;
import motor.MotorDiesel;
import motor.MotorGasolina;
import relacionDiferencial.RelacionDiferencial47;
import relacionDiferencial.RelacionDiferencial49;
import suspension.SuspensionARB;
import suspension.SuspensionTJM;

public class EnsamblarCarros {

	public static void main(String[] args) {
	//Polimorfismo
		new CarroDiesel(crearMotor(TipoMotor.DIESEL),
				crearRelacionDiferencial(TipoRelacionDiferencial.RELACIONDIFERENCIAL47),
				crearSuspension(TipoSuspension.ARB)).tipoCarroOffRoad();
		new CarroDiesel(crearMotor(TipoMotor.DIESEL),
				crearRelacionDiferencial(TipoRelacionDiferencial.RELACIONDIFERENCIAL49),
				crearSuspension(TipoSuspension.TJM)).tipoCarroOffRoad();
		
		new CarroGasolina(crearMotor(TipoMotor.GASOLINA),
				crearRelacionDiferencial(TipoRelacionDiferencial.RELACIONDIFERENCIAL49),
				crearSuspension(TipoSuspension.ARB)).tipoCarroOffRoad();
		new CarroGasolina(crearMotor(TipoMotor.GASOLINA),
				crearRelacionDiferencial(TipoRelacionDiferencial.RELACIONDIFERENCIAL47),
				crearSuspension(TipoSuspension.TJM)).tipoCarroOffRoad();
	}

	private enum TipoMotor {
		DIESEL,
		GASOLINA
	}

	private enum TipoRelacionDiferencial{
		RELACIONDIFERENCIAL47,
		RELACIONDIFERENCIAL49
	}

	private enum TipoSuspension {
		ARB,
		TJM
	}
	
	//Inyección de Dependencias
	private static Motor crearMotor(TipoMotor type) {
		if (type.equals(TipoMotor.DIESEL)) {
			return new MotorDiesel();
		}
		return new MotorGasolina();
	}
	
	private static RelacionesDiferenciales crearRelacionDiferencial(TipoRelacionDiferencial type) {
		if (type.equals(TipoRelacionDiferencial.RELACIONDIFERENCIAL47)) {
			return new RelacionDiferencial47();
		}
		return new RelacionDiferencial49();
	}

	private static Suspension crearSuspension(TipoSuspension type) {
		if (type.equals(TipoSuspension.ARB)) {
			return new SuspensionARB();
		}
		return new SuspensionTJM();
	}


	
}
