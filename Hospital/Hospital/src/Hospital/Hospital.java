package Hospital;

public class Hospital {

	public static void main(String[] args) {
		
		/*Personal administrativo = new Personal();
		administrativo.setSueldo(5000); // Cambio el valor del sueldo
		System.out.println(administrativo); // Aqui actua el toString()
		*/
		
		/*domicilio direccion = null;
		Medicos mm = new Medicos("Juan", "Per?z", 38583, 3000, direccion);
		direccion.setCalle("Rivadavia 5482");
		direccion.setDepto("A");*/
		
		// Hago la instancia del objeto Medicos y Enfermeros
		Personal Med = new Medicos("5452323", "Neurologia", 25000, 35, "Fernandez", "Pablo");
		Personal Enf = new Enfermeros("TPI", 11000, 29, "Gomez", "Raul");
		// Ejecuto los m?todos para obtener el sueldo de cada uno
		Med.Sueldo();
		Enf.Sueldo();
	}

}
