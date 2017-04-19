package DataTemp;

/**
 *
 * @author Rolli Prabu D
 */

import java.util.ArrayList;
public class DatabaseNilai {
    String nama, namagroup;
    int nilaia, nilaib, nilaic, nilaid, ratiototal, nilaitotal;
    
    ArrayList<DatabaseNilai> dbnilai = new ArrayList<>();
    
    public DatabaseNilai(String namagroup, String nama, int nilaia, int nilaib, int nilaic, 
            int nilaid, int nilaitotal, int ratiototal){
        this.namagroup=namagroup;
        this.nama=nama;
        this.nilaia=nilaia;
        this.nilaib=nilaib;
        this.nilaic=nilaic;
        this.nilaid=nilaid;
        this.ratiototal=ratiototal;
        this.nilaitotal=nilaitotal;
    }
    
    public void addDatabase(DatabaseNilai db){
        dbnilai.add(db);
    }
    
    public String getNamaGroup(){
        return namagroup;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getNilaiA(){
        return nilaia;
    }
    
    public int getNilaiB(){
        return nilaib;
    }
    
    public int getNilaiC(){
        return nilaic;
    }
    
    public int getNilaiD(){
        return nilaid;
    }
    
    public int getRatioTotal(){
        return ratiototal;
    }
    
    public int getNilaiTotal(){
        return nilaitotal;
    }
}
