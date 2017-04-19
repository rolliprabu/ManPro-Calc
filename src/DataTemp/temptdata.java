
package DataTemp;

/**
 *
 * @author Rolli Prabu D
 */
public class temptdata {    
    int a1=0, a2=0, a3=0, a4=0, ar=0;
    int b1=0, b2=0, b3=0, b4=0, br=0;
    int c1=0, c2=0, c3=0, c4=0, cr=0;
    int d1=0, d2=0, d3=0, d4=0, dr=0;
    int e1=0, e2=0, e3=0, e4=0, er=0;
    int reroll=0;
    
    public void setNilaia(int a1a, int a2a, int a3a, int a4a, int ara){
        this.a1 = a1+a1a;
        this.a2 = a2+a2a;
        this.a3 = a3+a3a;
        this.a4 = a4+a4a;
        this.ar = ar+ara;    
    }
    
    public void setNilaib(int b1a, int b2a, int b3a, int b4a, int bra){
        this.b1 = b1+b1a;
        this.b2 = b2+b2a;
        this.b3 = b3+b3a;
        this.b4 = b4+b4a;
        this.br = br+bra;
    } 
    
    public void setNilaic(int c1a, int c2a, int c3a, int c4a, int cra){
        this.c1 = c1+c1a;
        this.c2 = c2+c2a;
        this.c3 = c3+c3a;
        this.c4 = c4+c4a;
        this.cr = cr+cra;
    }
    
    public void setNilaid(int d1a, int d2a, int d3a, int d4a, int dra){
        this.d1 = d1+d1a;
        this.d2 = d2+d2a;
        this.d3 = d3+d3a;
        this.d4 = d4+d4a;
        this.dr = dr+dra;
    }
    
    public void setNilaie(int e1a, int e2a, int e3a, int e4a, int era){
        this.e1 = e1+e1a;
        this.e2 = e2+e2a;
        this.e3 = e3+e3a;
        this.e4 = e4+e4a;
        this.er = er+era;
    }
    
    public int jumlahNilaiA(){
        int atotal = a1+a2+a3+a4;
        return atotal;
    }
    
    public int jumlahNilaiB(){
        int btotal = b1+b2+b3+b4;
        return btotal;
    }
    
    public int jumlahNilaiC(){
        int ctotal = c1+c2+c3+c4;
        return ctotal;
    }
    
    public int jumlahNilaiD(){
        int dtotal = d1+d2+d3+d4;
        return dtotal;
    }
    
    public int jumlahNilaiE(){
        int etotal = e1+e2+e3+e4;
        return etotal;
    }
    
    public String getNilaia(){
        String pta1 = Integer.toString(a1);
        String pta2 = Integer.toString(a2);
        String pta3 = Integer.toString(a3);
        String pta4 = Integer.toString(a4);
        String ptar = Integer.toString(ar);
        String ulta = "\n a: "+pta1+" | b: "+pta2+" | c: "+pta3+" | d: "+pta4+" | ratio: "+ptar+"\n\n";
        
        return ulta;
    }
    
    public String getNilaib(){
        String ptb1 = Integer.toString(b1);
        String ptb2 = Integer.toString(b2);
        String ptb3 = Integer.toString(b3);
        String ptb4 = Integer.toString(b4);
        String ptbr = Integer.toString(br);
        String ultb = "\n a: "+ptb1+" | b: "+ptb2+" | c: "+ptb3+" | d: "+ptb4+" | ratio: "+ptbr+"\n\n";
        
        return ultb;
    }
    
    public String getNilaic(){
        String ptc1 = Integer.toString(c1);
        String ptc2 = Integer.toString(c2);
        String ptc3 = Integer.toString(c3);
        String ptc4 = Integer.toString(c4);
        String ptcr = Integer.toString(cr);
        String ultc = "\n a: "+ptc1+" | b: "+ptc2+" | c: "+ptc3+" | d: "+ptc4+" | ratio: "+ptcr+"\n\n";
        
        return ultc;
    }
    
    public String getNilaid(){
        String ptd1 = Integer.toString(d1);
        String ptd2 = Integer.toString(d2);
        String ptd3 = Integer.toString(d3);
        String ptd4 = Integer.toString(d4);
        String ptdr = Integer.toString(dr);
        String ultd = "\n a: "+ptd1+" | b: "+ptd2+" | c: "+ptd3+" | d: "+ptd4+" | ratio: "+ptdr+"\n\n";
        
        return ultd;
    }
    
    public String getNilaie(){
        String pte1 = Integer.toString(e1);
        String pte2 = Integer.toString(e2);
        String pte3 = Integer.toString(e3);
        String pte4 = Integer.toString(e4);
        String pter = Integer.toString(er);
        String ulte = "\n a: "+pte1+" | b: "+pte2+" | c: "+pte3+" | d: "+pte4+" | ratio: "+pter+"\n\n";
        
        return ulte;
    }
    
    public int getA1(){
        return a1;
    }
    
    public int getA2(){
        return a2;
    }
    
    public int getA3(){
        return a3;
    }
    
    public int getA4(){
        return a4;
    }
    
    public int getB1(){
        return b1;
    }
    
    public int getB2(){
        return b2;
    }
    
    public int getB3(){
        return b3;
    }
    
    public int getB4(){
        return b4;
    }
    
    public int getC1(){
        return c1;
    }
    
    public int getC2(){
        return c2;
    }
    
    public int getC3(){
        return c3;
    }
    
    public int getC4(){
        return c4;
    }
    
    public int getD1(){
        return d1;
    }
    
    public int getD2(){
        return d2;
    }
    
    public int getD3(){
        return d3;
    }
    
    public int getD4(){
        return d4;
    }
        
    public int getE1(){
        return e1;
    }
    
    public int getE2(){
        return e2;
    }
    
    public int getE3(){
        return e3;
    }
    
    public int getE4(){
        return e4;
    }
    
    public int getAr(){
        return ar;
    }
    
    public int getBr(){
        return br;
    }
    
    public int getCr(){
        return cr;
    }
    
    public int getDr(){
        return dr;
    }
    
    public int getEr(){
        return er;
    }
    
    public int reroll(){
        reroll++;        
        return reroll;
    }
}
