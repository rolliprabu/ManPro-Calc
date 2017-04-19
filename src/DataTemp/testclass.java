/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTemp;

/**
 *
 * @author Rolls
 */
public class testclass {
    String namasiswa;
    int nilai1, nilai2, nilai3;
    
    public testclass(String nama, int nilai1, int nilai2, int nilai3){
        this.namasiswa=nama;
        this.nilai1=nilai1;
        this.nilai2=nilai2;
        this.nilai3=nilai3;
    }
    
    public String getNama(){
        return namasiswa;
    }
    
    public int getNilai1(){
        return nilai1;
    }
    
    public int getNilai2(){
        return nilai2;
    }
    
    public int getNilai3(){
        return nilai3;
    }
    
    @Override
    public String toString(){
        return namasiswa+" "+nilai1+" "+nilai2+" "+nilai3;
    }
}
