package Hospital;

public abstract class Personal {
	
	public double sueldo = 3000.00;
	public int edad = 25;
	public String apellido = "Perez";
	public String nombre = "Jos?";
	
	//Constructor por defecto
	public Personal() {
		
	}
	
	// Constructor sobrecargado
	public Personal(double sueldo, int edad, String apellido, String nombre) {
		this.sueldo = sueldo;
		this.edad = edad;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	abstract void Sueldo();
	
	
	// Metodos para obtener o modificar el valor de sueldo
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	// Metodo que devuelve la info completa del objeto
	@Override
	public String toString() {
		String mensaje = "El empleado se llama " + nombre + " " + apellido + " con " + edad + " a?os " 
				+ " y un salario de " + sueldo;
		return mensaje;
	}
	
	
	//Metodo aumentar el sueldo
			final void aumentarSueldo(double sueldo) {
				this.sueldo = sueldo * 1.30;
			}
	

	/*
	// Genero una Composici?n
	
	// Incluyo la clase domicilio dentro de la clase Personal y genero una subclase para que las
	// personas puedan contar con los datos
	class domicilio{
		public String 
		//calle;
		public int piso;
		public String depto;
		public String localidad;
		public String provincia;
		
		// Constructores
		public domicilio() {
			
		}

		public domicilio(String calle, int piso, String depto, String localidad, String provincia) {
			this.calle = calle;
			this.piso = piso;
			this.depto = depto;
			this.localidad = localidad;
			this.provincia = provincia;
			
		}
		
		
		
		//Getters y Setters

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public int getPiso() {
			return piso;
		}

		public void setPiso(int piso) {
			this.piso = piso;
		}

		public String getDepto() {
			return depto;
		}

		public void setDepto(String depto) {
			this.depto = depto;
		}

		public String getLocalidad() {
			return localidad;
		}

		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		
	}*/
	
}
