package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos()
	{
		int numeroAsientos = 0;
		for (Asiento i : this.asientos)
		{
			if (i !=null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		if(registro == motor.registro)
		{
			for (Asiento i : this.asientos)
			{
				if (i !=null) {
					if (i.registro != registro) {
						return "Las piezas no son originales";
					 }
				 }
						
		      }	
			return "Auto original";
	     }
		else {
			return "Las piezas no son originales";
		}
	}
}

