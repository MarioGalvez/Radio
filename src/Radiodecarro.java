

 import java.math.BigDecimal; // libreria para darle formato a los datos double


public class Radiodecarro implements Radio{
	private boolean estado;		//indica si el radio esta on o off
	private int AMFM;			//indica si el radio esta en AM oFM
	private double[] botonesAM;	//las memorias guardadas de AM
	private double[] botonesFM;	//las memorias guardadas de FM
	private double estacion;		//la estacion sintonizada actualmente
	private double intervalo;	//en cuanto se va a cambiar la estacion
	private double AM;			//ultima estacion sintonizada en AM
	private double FM;			//ultima estacion sintonizada en FM
	
	//constructor predeterminado
	public Radiodecarro(){
		estado=true;
		AMFM=0;
		botonesAM=new double[12];
		botonesFM=new double[12];
		estacion=530.00f;
		intervalo=10.00f;
		AM=530.00f;
		FM=87.9f;
		int x=0;
		while (x<12){
			botonesAM[x]=530f;
			botonesFM[x]=87.9f;
			x=x+1;
		}
	}
	
	//setEstado
	public void setEstado(boolean estado){
		this.estado=estado;
	}
	
	//getEstado
	public boolean getEstado(){
		return estado;
	}
	
	//setAMFM
	public void setAMFM(int amfm){
		if (AMFM==0){
			AM=estacion;
		}
		else{
			FM=estacion;
		}
		AMFM=amfm;
		if (AMFM==0){
			intervalo=10.00f;
			estacion=AM;
		}
		else{
			intervalo=0.2f;
			estacion=FM;
		}
	}
	
	//getAMFM
	public int getAMFM(){
		return AMFM;
	}
	
	//depenciendo del valor enviado en el parametro varia estacion
	//en una cantidad guardada en intervalo hacia ariba o hacia abajo
	public void sintonizar(boolean ud){
		if (ud){
			estacion+=intervalo;
		}
		else{
			estacion-=intervalo;
		}
		
		
		if (AMFM==0){
			if (estacion>1610){
				estacion=530;
			}
			else if (estacion<530){
				estacion=1610;
			}
		}
		else{
			if (estacion>107.9){
				estacion=87.9f;
			}
			else if(estacion<87.9){
				estacion=107.9f;
			}
		}
		
	}
	
	//Guarda la estacon actual en la posicion de memoria enviada
	//en el parametro en la lista corespondiente al tipo de frecuencia
	public void guardar(int pos){
		if (AMFM==0){
			botonesAM[pos]=estacion;
		}
		else{
			botonesFM[pos]=estacion;
		}
	}
	
	//Guarda en estacion el valor de la posicion enviada en el parametro
	//en la lista correspondiente al ancho de banda seleccionado actualmente
	public void memoria(int pos){
		if (AMFM==0){
			estacion=botonesAM[pos];
		}
		else{
			estacion=botonesFM[pos];
		}
	}
	
	//getEmisora
	public double getEmisora(){
		int decimalPlaces = 2;
		BigDecimal bd = new BigDecimal(estacion);
		bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
		estacion = (double) bd.doubleValue(); // se le da un formato con dos decimales a 'emisoraActualFM'
		return estacion;
	}
	
	
	
	
	
}