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
    
    public void setEstado(boolean nEstado){}
    public boolean getEstado(){}
    public void setAMFM(int banda){}
    public int getAMFM(){}
    public int sincronizar(boolean ud){}
    public void guardar(int pos){}
    public void memoria(int pos){}
    public float getEmisora(){}
    
    
}
