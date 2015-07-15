


public interface Radio{

	public void setESTADO(boolean estado);
	//
	//pre:ninguna
	//post:Cambia el atributo estado por la enviada en el parametro
	
	public boolean getEstado();
	//
	//pre:
	//post:
	
	public int getAMFM();
	//
	//pre:
	//post:
	
	public void setAMFM(int amfm);
	//
	//pre:ninguna
	//post:Cambia el tributo AMFM por el valor enviado en el parametro
	
	public void Sintonizar(boolean ud);
	//Descripcion: barre frecuencias escalon por escalon
	//pre:ninguna
	//post:cambia el valor de la estacion dependiendo si es true o false
	//si es true le suma si es false le resta
	
	public void Guardar(int pos);
	//Descripcion: guarda frecuecias en las memorias disponibles
	//pre:
	//post:guarda el valor actual de la frecuencia en la posicion
	//recibida en el parametro
	
	public void Memoria(int pos);
	//Descripcion: sintoniza frecuencias guardadas en memoria
	//pre:
	//post:cambia el valor de la frecuencia por el valor guardado en la 
	//posicion recibida en el parametro
	
	public double getEmisora();
	//
	//pre:
	//popst:

}