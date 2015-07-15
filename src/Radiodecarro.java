/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiyi
 */
public class Radiodecarro implements Radio {
    private boolean estado;
    private int AMFM;
    private float[] botonesAM;
    private float[] botonesFM;
    private float estacion;
    private float intervalo;
    private float AM;
    private float FM;
    
    public Radiocarro(){
        estado=false;
        AMFM=0;
        botonesAM=new float[12];
        botonesFM=new float[12];
        estacion=530.00f;
        intervalo=10.00f;
        AM=530.00f;
        FM=87.9f;
    }
    
    public void setEstado(boolean nEstado){
        estado=nEstado;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setAMFM(int banda){
        if(AMFM==0){
            AM=estacion;
        }
        else{
            FM=estacion;
        }
        AMFM=banda;
        if(AMFM==0){
            intervalo=10.00f;
            estacion=AM;
        }
        else{
            intervalo=0.2f;
            estacion=FM;
        }
    }
    public int getAMFM(){
        return AMFM;
    }
    public int sincronizar(boolean ud){
        if(ud){
            estacion+=intervalo;
        }
        else{
            estacion-=intervalo;
        }
        if(AMFM==0){
            if(estacion>1610){
                estacion=530;
            }
            else if(estacion<530){
                estacion=1610;
            }
        }
        else{
            if(estacion>107.9){
                estacion=87.9f;
            }
            else if(estacion<87.9){
                estacion=107.9f;
            }
        }
    }
    public void guardar(int pos){}
    public void memoria(int pos){}
    public float getEmisora(){}
    
    
}
