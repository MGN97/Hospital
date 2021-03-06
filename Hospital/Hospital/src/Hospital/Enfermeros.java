package Hospital;

final class Enfermeros extends Personal {
	private String sector;

	public Enfermeros() {
		
	}

	public Enfermeros(String sector, double sueldo, int edad, String apellido, String nombre) {
		super(sueldo, edad, apellido, nombre);
		this.sueldo = sueldo;
		sector = "Neonatologia";
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	// se codifica el metodo sueldo ya que es abstracto
	@Override
	void Sueldo() { System.out.println("El sueldo de Enfermero es de " + sueldo + "--");
	
	}

}
