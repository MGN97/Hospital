package Hospital;

public class Medicos extends Personal {
	
	private String matricula;
	private String especialidad;
	
	
	
	public Medicos() {
		
	}

	public Medicos(String matricula, String especialidad, double sueldo, int edad, String apellido, String nombre) {
		super(sueldo, edad, apellido, nombre);
		this.sueldo = sueldo;
		matricula = "35853";
		especialidad = "Clínica Médica";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	// se codifica el metodo sueldo ya que es abstracto
	@Override
	void Sueldo() {
		System.out.println("El sueldo de Médico es de " + this.sueldo + "-");
	}


	

	
	

}
