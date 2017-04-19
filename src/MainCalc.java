import DataTemp.DatabaseNilai;
import DataTemp.temptdata;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Rolli Prabu D
 */
public class MainCalc extends javax.swing.JFrame {

    int a1 = 0, a2 = 0, a3 = 0, a4 = 0, ar = 0;
    int b1 = 0, b2 = 0, b3 = 0, b4 = 0, br = 0;
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, cr = 0;
    int d1 = 0, d2 = 0, d3 = 0, d4 = 0, dr = 0;
    int e1 = 0, e2 = 0, e3 = 0, e4 = 0, er = 0;
    int jumlahteam = 0;
    int rollnumber = 0;
    int tester;
    int contribution=0;

    String nama1 = null;
    String nama2 = null;
    String nama3 = null;
    String nama4 = null;
    String nama5 = null;
    String namat = null;
    String stringtemp;

    temptdata tadi = new temptdata();
    
    ArrayList<DatabaseNilai> lowl = new ArrayList<>();

    public void setFormNumber() {
        int jmlh = jumlahAnggota();
        outFormTotal.setText(Integer.toString(jmlh));

        rollnumber++;
        outFormNumber.setText(Integer.toString(rollnumber));
    }

    public void setNama(String namaa, String namab, String namac, String namad, String namae, String namat) {
        this.nama1 = namaa;
        this.nama2 = namab;
        this.nama3 = namac;
        this.nama4 = namad;
        this.nama5 = namae;
        this.namat = namat;

        inNama1.setText(nama1);
        inNama2.setText(nama2);
        inNama3.setText(nama3);
        inNama4.setText(nama4);
        inNama5.setText(nama5);
        inNamaTeam.setText(namat);
    }

    public void ratioSetter(){
        inRatio1.setText("0");
        inRatio2.setText("0");
        inRatio3.setText("0");
        inRatio4.setText("0");
        inRatio5.setText("0");
    }
    
    public int jumlahAnggota() {
        jumlahteam = 0;
        stringtemp = "start";
        String teamarray[] = {nama1, nama2, nama3, nama4, nama5};

        for (jumlahteam = 0; jumlahteam < 5; jumlahteam++) {
            stringtemp = teamarray[jumlahteam];

            if (stringtemp.equals("")) {
                break;
            }
        }

        return jumlahteam;
    }

    public void clearField() {
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup6.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        buttonGroup10.clearSelection();
        buttonGroup11.clearSelection();
        buttonGroup12.clearSelection();
        buttonGroup13.clearSelection();
        buttonGroup14.clearSelection();
        buttonGroup15.clearSelection();
        buttonGroup16.clearSelection();
        buttonGroup17.clearSelection();
        buttonGroup18.clearSelection();
        buttonGroup19.clearSelection();
        buttonGroup20.clearSelection();
        inRatio1.setText("");
        inRatio2.setText("");
        inRatio3.setText("");
        inRatio4.setText("");
        inRatio5.setText("");
    }
    
    public void clearFieldRatio(){
        inRatio1.setText("");
        inRatio2.setText("");
        inRatio3.setText("");
        inRatio4.setText("");
        inRatio5.setText("");
    }

    public int contributionChecker(){
        int ratio1 = Integer.parseInt(inRatio1.getText());
        int ratio2 = Integer.parseInt(inRatio2.getText());
        int ratio3 = Integer.parseInt(inRatio3.getText());
        int ratio4 = Integer.parseInt(inRatio4.getText());
        int ratio5 = Integer.parseInt(inRatio5.getText());
        int ratiototal=0;
        int jmltm = jumlahAnggota();
        
        switch(jmltm){
            case 5:
                ratiototal=ratio1+ratio2+ratio3+ratio4+ratio5;
                break;
            case 4:
                ratiototal=ratio1+ratio2+ratio3+ratio4;
                break;
            case 3:
                ratiototal=ratio1+ratio2+ratio3;
                break;
            case 2: 
                ratiototal=ratio1+ratio2;
                break;
            default:
                ratiototal=ratio1;
                break;
        }
        
        return ratiototal;
    }
    
    public int radioButtonNumber(int anggota){
        int totalgrp=4*anggota;
        return totalgrp;
    }
    
    public int totalRadioButton(int anggota){
        int jumlahbtn=0;
        
        switch (anggota) {
            case 5:
                {
                    int totala=a1+a2+a3+a4;
                    int totalb=a1+a2+a3+a4;
                    int totalc=a1+a2+a3+a4;
                    int totald=a1+a2+a3+a4;
                    int totale=a1+a2+a3+a4;
                    
                    jumlahbtn=totala+totalb+totalc+totald+totale;
                    break;
                }
            case 4:
                {
                    int totala=a1+a2+a3+a4;
                    int totalb=a1+a2+a3+a4;
                    int totalc=a1+a2+a3+a4;
                    int totald=a1+a2+a3+a4;
                    
                    jumlahbtn=totala+totalb+totalc+totald;
                    break;
                }
            case 3:
                {
                    int totala=a1+a2+a3+a4;
                    int totalb=a1+a2+a3+a4;
                    int totalc=a1+a2+a3+a4;
                    
                    jumlahbtn=totala+totalb+totalc;
                    break;
                }
            case 2:
                {
                    int totala=a1+a2+a3+a4;
                    int totalb=a1+a2+a3+a4;
                    
                    jumlahbtn=totala+totalb;
                    break;
                }
            default:
                {
                    int totala=a1+a2+a3+a4;
                    
                    jumlahbtn=totala;
                    break;
                }
        }
        
        return jumlahbtn;
    }
    
    public void nilaiReset(){
        a1 = 0; a2 = 0; a3 = 0; a4 = 0; ar = 0;
        b1 = 0; b2 = 0; b3 = 0; b4 = 0; br = 0;
        c1 = 0; c2 = 0; c3 = 0; c4 = 0; cr = 0;
        d1 = 0; d2 = 0; d3 = 0; d4 = 0; dr = 0;
        e1 = 0; e2 = 0; e3 = 0; e4 = 0; er = 0;
    }
    
    public MainCalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inNama1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inRatio1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inNama2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        inRatio2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inNama3 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        inRatio3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        inNama4 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        inRatio4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        inNama5 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jRadioButton85 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jRadioButton96 = new javax.swing.JRadioButton();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        inRatio5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnMenuAwal = new javax.swing.JButton();
        btnCekNilai = new javax.swing.JButton();
        btnNextInput = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        outFormNumber = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        outFormTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnClearField = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        inNamaTeam = new javax.swing.JTextField();
        btnToExcel = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(984, 428));
        setMinimumSize(new java.awt.Dimension(984, 428));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("1.");

        inNama1.setEditable(false);
        inNama1.setBackground(new java.awt.Color(226, 223, 223));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("4");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("5");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)))
        );

        jLabel2.setText("No.");

        jLabel3.setText("Team Member");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("1");
        jRadioButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseClicked(evt);
            }
        });

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("2");
        jRadioButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton7MouseClicked(evt);
            }
        });

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("3");
        jRadioButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton8MouseClicked(evt);
            }
        });

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("4");
        jRadioButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton9MouseClicked(evt);
            }
        });

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("5");
        jRadioButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("1");
        jRadioButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton11MouseClicked(evt);
            }
        });

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("2");
        jRadioButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton12MouseClicked(evt);
            }
        });

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("3");
        jRadioButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton13MouseClicked(evt);
            }
        });

        buttonGroup3.add(jRadioButton14);
        jRadioButton14.setText("4");
        jRadioButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton14MouseClicked(evt);
            }
        });

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setText("5");
        jRadioButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup4.add(jRadioButton16);
        jRadioButton16.setText("1");
        jRadioButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton16MouseClicked(evt);
            }
        });

        buttonGroup4.add(jRadioButton17);
        jRadioButton17.setText("2");
        jRadioButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton17MouseClicked(evt);
            }
        });

        buttonGroup4.add(jRadioButton18);
        jRadioButton18.setText("3");
        jRadioButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton18MouseClicked(evt);
            }
        });

        buttonGroup4.add(jRadioButton19);
        jRadioButton19.setText("4");
        jRadioButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton19MouseClicked(evt);
            }
        });

        buttonGroup4.add(jRadioButton20);
        jRadioButton20.setText("5");
        jRadioButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jRadioButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20)))
        );

        jLabel4.setText("Quality");

        jLabel5.setText("Quantity");

        jLabel6.setText("Timeliness");

        jLabel7.setText("Level");

        jLabel8.setText("Contribution");

        jLabel10.setText("%");

        jLabel9.setText("2.");

        inNama2.setEditable(false);
        inNama2.setBackground(new java.awt.Color(226, 223, 223));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 27));

        buttonGroup5.add(jRadioButton21);
        jRadioButton21.setText("1");
        jRadioButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton21MouseClicked(evt);
            }
        });

        buttonGroup5.add(jRadioButton22);
        jRadioButton22.setText("2");
        jRadioButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton22MouseClicked(evt);
            }
        });

        buttonGroup5.add(jRadioButton23);
        jRadioButton23.setText("3");
        jRadioButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton23MouseClicked(evt);
            }
        });

        buttonGroup5.add(jRadioButton24);
        jRadioButton24.setText("4");
        jRadioButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton24MouseClicked(evt);
            }
        });

        buttonGroup5.add(jRadioButton25);
        jRadioButton25.setText("5");
        jRadioButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jRadioButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton25)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24)
                    .addComponent(jRadioButton25)))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup6.add(jRadioButton26);
        jRadioButton26.setText("1");
        jRadioButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton26MouseClicked(evt);
            }
        });

        buttonGroup6.add(jRadioButton27);
        jRadioButton27.setText("2");
        jRadioButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton27MouseClicked(evt);
            }
        });

        buttonGroup6.add(jRadioButton28);
        jRadioButton28.setText("3");
        jRadioButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton28MouseClicked(evt);
            }
        });

        buttonGroup6.add(jRadioButton29);
        jRadioButton29.setText("4");
        jRadioButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton29MouseClicked(evt);
            }
        });

        buttonGroup6.add(jRadioButton30);
        jRadioButton30.setText("5");
        jRadioButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jRadioButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton30)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30)))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup7.add(jRadioButton31);
        jRadioButton31.setText("1");
        jRadioButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton31MouseClicked(evt);
            }
        });

        buttonGroup7.add(jRadioButton32);
        jRadioButton32.setText("2");
        jRadioButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton32MouseClicked(evt);
            }
        });

        buttonGroup7.add(jRadioButton33);
        jRadioButton33.setText("3");
        jRadioButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton33MouseClicked(evt);
            }
        });

        buttonGroup7.add(jRadioButton34);
        jRadioButton34.setText("4");
        jRadioButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton34MouseClicked(evt);
            }
        });

        buttonGroup7.add(jRadioButton35);
        jRadioButton35.setText("5");
        jRadioButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jRadioButton31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton35)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34)
                    .addComponent(jRadioButton35)))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup8.add(jRadioButton36);
        jRadioButton36.setText("1");
        jRadioButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton36MouseClicked(evt);
            }
        });

        buttonGroup8.add(jRadioButton37);
        jRadioButton37.setText("2");
        jRadioButton37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton37MouseClicked(evt);
            }
        });

        buttonGroup8.add(jRadioButton38);
        jRadioButton38.setText("3");
        jRadioButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton38MouseClicked(evt);
            }
        });

        buttonGroup8.add(jRadioButton39);
        jRadioButton39.setText("4");
        jRadioButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton39MouseClicked(evt);
            }
        });

        buttonGroup8.add(jRadioButton40);
        jRadioButton40.setText("5");
        jRadioButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jRadioButton36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton40)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton36)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40)))
        );

        jLabel11.setText("%");

        jLabel12.setText("3.");

        inNama3.setEditable(false);
        inNama3.setBackground(new java.awt.Color(226, 223, 223));
        inNama3.setPreferredSize(new java.awt.Dimension(6, 27));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup9.add(jRadioButton41);
        jRadioButton41.setText("1");
        jRadioButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton41MouseClicked(evt);
            }
        });

        buttonGroup9.add(jRadioButton42);
        jRadioButton42.setText("2");
        jRadioButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton42MouseClicked(evt);
            }
        });

        buttonGroup9.add(jRadioButton43);
        jRadioButton43.setText("3");
        jRadioButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton43MouseClicked(evt);
            }
        });

        buttonGroup9.add(jRadioButton44);
        jRadioButton44.setText("4");
        jRadioButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton44MouseClicked(evt);
            }
        });

        buttonGroup9.add(jRadioButton45);
        jRadioButton45.setText("5");
        jRadioButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jRadioButton41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton45)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45)))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup10.add(jRadioButton46);
        jRadioButton46.setText("1");
        jRadioButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton46MouseClicked(evt);
            }
        });

        buttonGroup10.add(jRadioButton47);
        jRadioButton47.setText("2");
        jRadioButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton47MouseClicked(evt);
            }
        });

        buttonGroup10.add(jRadioButton48);
        jRadioButton48.setText("3");
        jRadioButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton48MouseClicked(evt);
            }
        });

        buttonGroup10.add(jRadioButton49);
        jRadioButton49.setText("4");
        jRadioButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton49MouseClicked(evt);
            }
        });

        buttonGroup10.add(jRadioButton50);
        jRadioButton50.setText("5");
        jRadioButton50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jRadioButton46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton50)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton46)
                    .addComponent(jRadioButton47)
                    .addComponent(jRadioButton48)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton50)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup11.add(jRadioButton51);
        jRadioButton51.setText("1");
        jRadioButton51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton51MouseClicked(evt);
            }
        });

        buttonGroup11.add(jRadioButton52);
        jRadioButton52.setText("2");
        jRadioButton52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton52MouseClicked(evt);
            }
        });

        buttonGroup11.add(jRadioButton53);
        jRadioButton53.setText("3");
        jRadioButton53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton53MouseClicked(evt);
            }
        });

        buttonGroup11.add(jRadioButton54);
        jRadioButton54.setText("4");
        jRadioButton54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton54MouseClicked(evt);
            }
        });

        buttonGroup11.add(jRadioButton55);
        jRadioButton55.setText("5");
        jRadioButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jRadioButton51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton55)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton51)
                    .addComponent(jRadioButton52)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton54)
                    .addComponent(jRadioButton55)))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup12.add(jRadioButton56);
        jRadioButton56.setText("1");
        jRadioButton56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton56MouseClicked(evt);
            }
        });

        buttonGroup12.add(jRadioButton57);
        jRadioButton57.setText("2");
        jRadioButton57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton57MouseClicked(evt);
            }
        });

        buttonGroup12.add(jRadioButton58);
        jRadioButton58.setText("3");
        jRadioButton58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton58MouseClicked(evt);
            }
        });

        buttonGroup12.add(jRadioButton59);
        jRadioButton59.setText("4");
        jRadioButton59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton59MouseClicked(evt);
            }
        });

        buttonGroup12.add(jRadioButton60);
        jRadioButton60.setText("5");
        jRadioButton60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton60MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jRadioButton56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton60)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton56)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton58)
                    .addComponent(jRadioButton59)
                    .addComponent(jRadioButton60)))
        );

        jLabel13.setText("%");

        jLabel14.setText("4.");

        inNama4.setEditable(false);
        inNama4.setBackground(new java.awt.Color(226, 223, 223));
        inNama4.setPreferredSize(new java.awt.Dimension(6, 27));

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup13.add(jRadioButton61);
        jRadioButton61.setText("1");
        jRadioButton61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton61MouseClicked(evt);
            }
        });

        buttonGroup13.add(jRadioButton62);
        jRadioButton62.setText("2");
        jRadioButton62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton62MouseClicked(evt);
            }
        });

        buttonGroup13.add(jRadioButton63);
        jRadioButton63.setText("3");
        jRadioButton63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton63MouseClicked(evt);
            }
        });

        buttonGroup13.add(jRadioButton64);
        jRadioButton64.setText("4");
        jRadioButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton64MouseClicked(evt);
            }
        });

        buttonGroup13.add(jRadioButton65);
        jRadioButton65.setText("5");
        jRadioButton65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jRadioButton61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton65)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton61)
                    .addComponent(jRadioButton62)
                    .addComponent(jRadioButton63)
                    .addComponent(jRadioButton64)
                    .addComponent(jRadioButton65)))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup14.add(jRadioButton66);
        jRadioButton66.setText("1");
        jRadioButton66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton66MouseClicked(evt);
            }
        });

        buttonGroup14.add(jRadioButton67);
        jRadioButton67.setText("2");
        jRadioButton67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton67MouseClicked(evt);
            }
        });

        buttonGroup14.add(jRadioButton68);
        jRadioButton68.setText("3");
        jRadioButton68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton68MouseClicked(evt);
            }
        });

        buttonGroup14.add(jRadioButton69);
        jRadioButton69.setText("4");
        jRadioButton69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton69MouseClicked(evt);
            }
        });

        buttonGroup14.add(jRadioButton70);
        jRadioButton70.setText("5");
        jRadioButton70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton70MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jRadioButton66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton70)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton66)
                    .addComponent(jRadioButton67)
                    .addComponent(jRadioButton68)
                    .addComponent(jRadioButton69)
                    .addComponent(jRadioButton70)))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup15.add(jRadioButton71);
        jRadioButton71.setText("1");
        jRadioButton71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton71MouseClicked(evt);
            }
        });

        buttonGroup15.add(jRadioButton72);
        jRadioButton72.setText("2");
        jRadioButton72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton72MouseClicked(evt);
            }
        });

        buttonGroup15.add(jRadioButton73);
        jRadioButton73.setText("3");
        jRadioButton73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton73MouseClicked(evt);
            }
        });

        buttonGroup15.add(jRadioButton74);
        jRadioButton74.setText("4");
        jRadioButton74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton74MouseClicked(evt);
            }
        });

        buttonGroup15.add(jRadioButton75);
        jRadioButton75.setText("5");
        jRadioButton75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton75MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jRadioButton71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton75)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton71)
                    .addComponent(jRadioButton72)
                    .addComponent(jRadioButton73)
                    .addComponent(jRadioButton74)
                    .addComponent(jRadioButton75)))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup16.add(jRadioButton76);
        jRadioButton76.setText("1");
        jRadioButton76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton76MouseClicked(evt);
            }
        });

        buttonGroup16.add(jRadioButton77);
        jRadioButton77.setText("2");
        jRadioButton77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton77MouseClicked(evt);
            }
        });

        buttonGroup16.add(jRadioButton78);
        jRadioButton78.setText("3");
        jRadioButton78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton78MouseClicked(evt);
            }
        });

        buttonGroup16.add(jRadioButton79);
        jRadioButton79.setText("4");
        jRadioButton79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton79MouseClicked(evt);
            }
        });

        buttonGroup16.add(jRadioButton80);
        jRadioButton80.setText("5");
        jRadioButton80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton80MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jRadioButton76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton80)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton76)
                    .addComponent(jRadioButton77)
                    .addComponent(jRadioButton78)
                    .addComponent(jRadioButton79)
                    .addComponent(jRadioButton80)))
        );

        jLabel15.setText("%");

        jLabel17.setText("5.");

        inNama5.setEditable(false);
        inNama5.setBackground(new java.awt.Color(226, 223, 223));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup17.add(jRadioButton81);
        jRadioButton81.setText("1");
        jRadioButton81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton81MouseClicked(evt);
            }
        });

        buttonGroup17.add(jRadioButton82);
        jRadioButton82.setText("2");
        jRadioButton82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton82MouseClicked(evt);
            }
        });

        buttonGroup17.add(jRadioButton83);
        jRadioButton83.setText("3");
        jRadioButton83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton83MouseClicked(evt);
            }
        });

        buttonGroup17.add(jRadioButton84);
        jRadioButton84.setText("4");
        jRadioButton84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton84MouseClicked(evt);
            }
        });

        buttonGroup17.add(jRadioButton85);
        jRadioButton85.setText("5");
        jRadioButton85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton85MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jRadioButton81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton85)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton81)
                    .addComponent(jRadioButton82)
                    .addComponent(jRadioButton83)
                    .addComponent(jRadioButton84)
                    .addComponent(jRadioButton85)))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup18.add(jRadioButton86);
        jRadioButton86.setText("1");
        jRadioButton86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton86MouseClicked(evt);
            }
        });

        buttonGroup18.add(jRadioButton87);
        jRadioButton87.setText("2");
        jRadioButton87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton87MouseClicked(evt);
            }
        });

        buttonGroup18.add(jRadioButton88);
        jRadioButton88.setText("3");
        jRadioButton88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton88MouseClicked(evt);
            }
        });

        buttonGroup18.add(jRadioButton89);
        jRadioButton89.setText("4");
        jRadioButton89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton89MouseClicked(evt);
            }
        });

        buttonGroup18.add(jRadioButton90);
        jRadioButton90.setText("5");
        jRadioButton90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton90MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jRadioButton86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton90)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton86)
                    .addComponent(jRadioButton87)
                    .addComponent(jRadioButton88)
                    .addComponent(jRadioButton89)
                    .addComponent(jRadioButton90)))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup19.add(jRadioButton91);
        jRadioButton91.setText("1");
        jRadioButton91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton91MouseClicked(evt);
            }
        });

        buttonGroup19.add(jRadioButton92);
        jRadioButton92.setText("2");
        jRadioButton92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton92MouseClicked(evt);
            }
        });

        buttonGroup19.add(jRadioButton93);
        jRadioButton93.setText("3");
        jRadioButton93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton93MouseClicked(evt);
            }
        });

        buttonGroup19.add(jRadioButton94);
        jRadioButton94.setText("4");
        jRadioButton94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton94MouseClicked(evt);
            }
        });

        buttonGroup19.add(jRadioButton95);
        jRadioButton95.setText("5");
        jRadioButton95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton95MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jRadioButton91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton95)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton91)
                    .addComponent(jRadioButton92)
                    .addComponent(jRadioButton93)
                    .addComponent(jRadioButton94)
                    .addComponent(jRadioButton95)))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup20.add(jRadioButton96);
        jRadioButton96.setText("1");
        jRadioButton96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton96MouseClicked(evt);
            }
        });

        buttonGroup20.add(jRadioButton97);
        jRadioButton97.setText("2");
        jRadioButton97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton97MouseClicked(evt);
            }
        });

        buttonGroup20.add(jRadioButton98);
        jRadioButton98.setText("3");
        jRadioButton98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton98MouseClicked(evt);
            }
        });

        buttonGroup20.add(jRadioButton99);
        jRadioButton99.setText("4");
        jRadioButton99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton99MouseClicked(evt);
            }
        });

        buttonGroup20.add(jRadioButton100);
        jRadioButton100.setText("5");
        jRadioButton100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton100MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jRadioButton96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton100)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton96)
                    .addComponent(jRadioButton97)
                    .addComponent(jRadioButton98)
                    .addComponent(jRadioButton99)
                    .addComponent(jRadioButton100)))
        );

        jLabel16.setText("%");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("<html>\nnote: <br/>\n1. cukup isi bagian yang ada nama anggotanya saja <br/>\n2. isi bagian \"contribution\" hanya dengan angka (misal: 30)<br/>\n3. jumlah total \"contribution\" harus 100%<br/>\n4. gunakan tombol \"Hapus Penilaian\" untuk mengisi ulang nilai <br/>\n5. berikan penilaian yang sesuai<br/>\n</html>");

        jLabel21.setText("<html>\nketerangan nilai:<br/>\n1 = buruk atau tidak bekerja pada kategori ini<br/>\n2 = jauh dibawah rata-rata<br/>\n3 = dibawah rata-rata<br/>\n4 = rata-rata<br/>\n5 = diatas rata-rata<br/>\n</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(inNama1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inNama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inNama4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inNama5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inNama2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inRatio5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inRatio4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(inRatio3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inRatio2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inRatio1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inRatio1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inNama1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inRatio2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inNama2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inNama3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inRatio3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inRatio4)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inNama4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inNama5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inRatio5)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnMenuAwal.setText("Kembali ke Menu Awal");
        btnMenuAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAwalActionPerformed(evt);
            }
        });

        btnCekNilai.setText("cek nilai");
        btnCekNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekNilaiActionPerformed(evt);
            }
        });

        btnNextInput.setText("input selanjutnya");
        btnNextInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextInputActionPerformed(evt);
            }
        });

        jLabel19.setText("Pengisian form nilai ke:");

        outFormNumber.setBackground(new java.awt.Color(198, 195, 195));

        jLabel20.setText("dari:");

        jLabel22.setText("anggota");

        btnClearField.setText("Hapus Penilaian");
        btnClearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("Nama Kelompok: ");

        inNamaTeam.setEditable(false);
        inNamaTeam.setBackground(new java.awt.Color(226, 223, 223));

        btnToExcel.setText("Save to Excel");
        btnToExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToExcelActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outFormNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outFormTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnToExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCekNilai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuAwal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inNamaTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClearField)
                        .addComponent(btnNextInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCekNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenuAwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnToExcel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(outFormTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outFormNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNamaTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        a1 = 1;
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        a1 = 2;
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        a1 = 3;
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        a1 = 4;
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
        a1 = 5;
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jRadioButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton6MouseClicked
        a2 = 1;
    }//GEN-LAST:event_jRadioButton6MouseClicked

    private void jRadioButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton7MouseClicked
        a2 = 2;
    }//GEN-LAST:event_jRadioButton7MouseClicked

    private void jRadioButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton8MouseClicked
        a2 = 3;
    }//GEN-LAST:event_jRadioButton8MouseClicked

    private void jRadioButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton9MouseClicked
        a2 = 4;
    }//GEN-LAST:event_jRadioButton9MouseClicked

    private void jRadioButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton10MouseClicked
        a2 = 5;
    }//GEN-LAST:event_jRadioButton10MouseClicked

    private void btnMenuAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAwalActionPerformed
        nilaiReset();
        jumlahteam = 0;
        rollnumber = 0;
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuAwalActionPerformed

    private void jRadioButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton11MouseClicked
        a3 = 1;
    }//GEN-LAST:event_jRadioButton11MouseClicked

    private void jRadioButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton12MouseClicked
        a3 = 2;
    }//GEN-LAST:event_jRadioButton12MouseClicked

    private void jRadioButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton13MouseClicked
        a3 = 3;
    }//GEN-LAST:event_jRadioButton13MouseClicked

    private void jRadioButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton14MouseClicked
        a3 = 4;
    }//GEN-LAST:event_jRadioButton14MouseClicked

    private void jRadioButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton15MouseClicked
        a3 = 5;
    }//GEN-LAST:event_jRadioButton15MouseClicked

    private void jRadioButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton16MouseClicked
        a4 = 1;
    }//GEN-LAST:event_jRadioButton16MouseClicked

    private void jRadioButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton17MouseClicked
        a4 = 2;
    }//GEN-LAST:event_jRadioButton17MouseClicked

    private void jRadioButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton18MouseClicked
        a4 = 3;
    }//GEN-LAST:event_jRadioButton18MouseClicked

    private void jRadioButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton19MouseClicked
        a4 = 4;
    }//GEN-LAST:event_jRadioButton19MouseClicked

    private void jRadioButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton20MouseClicked
        a4 = 5;
    }//GEN-LAST:event_jRadioButton20MouseClicked

    private void jRadioButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton21MouseClicked
        b1 = 1;
    }//GEN-LAST:event_jRadioButton21MouseClicked

    private void jRadioButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton22MouseClicked
        b1 = 2;
    }//GEN-LAST:event_jRadioButton22MouseClicked

    private void jRadioButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton23MouseClicked
        b1 = 3;
    }//GEN-LAST:event_jRadioButton23MouseClicked

    private void jRadioButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton24MouseClicked
        b1 = 4;
    }//GEN-LAST:event_jRadioButton24MouseClicked

    private void jRadioButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton25MouseClicked
        b1 = 5;
    }//GEN-LAST:event_jRadioButton25MouseClicked

    private void jRadioButton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton26MouseClicked
        b2 = 1;
    }//GEN-LAST:event_jRadioButton26MouseClicked

    private void jRadioButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton27MouseClicked
        b2 = 2;
    }//GEN-LAST:event_jRadioButton27MouseClicked

    private void jRadioButton28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton28MouseClicked
        b2 = 3;
    }//GEN-LAST:event_jRadioButton28MouseClicked

    private void jRadioButton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton29MouseClicked
        b2 = 4;
    }//GEN-LAST:event_jRadioButton29MouseClicked

    private void jRadioButton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton30MouseClicked
        b2 = 5;
    }//GEN-LAST:event_jRadioButton30MouseClicked

    private void jRadioButton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton31MouseClicked
        b3 = 1;
    }//GEN-LAST:event_jRadioButton31MouseClicked

    private void jRadioButton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton32MouseClicked
        b3 = 2;
    }//GEN-LAST:event_jRadioButton32MouseClicked

    private void jRadioButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton33MouseClicked
        b3 = 3;
    }//GEN-LAST:event_jRadioButton33MouseClicked

    private void jRadioButton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton34MouseClicked
        b3 = 4;
    }//GEN-LAST:event_jRadioButton34MouseClicked

    private void jRadioButton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton35MouseClicked
        b3 = 5;
    }//GEN-LAST:event_jRadioButton35MouseClicked

    private void jRadioButton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton36MouseClicked
        b4 = 1;
    }//GEN-LAST:event_jRadioButton36MouseClicked

    private void jRadioButton37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton37MouseClicked
        b4 = 2;
    }//GEN-LAST:event_jRadioButton37MouseClicked

    private void jRadioButton38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton38MouseClicked
        b4 = 3;
    }//GEN-LAST:event_jRadioButton38MouseClicked

    private void jRadioButton39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton39MouseClicked
        b4 = 4;
    }//GEN-LAST:event_jRadioButton39MouseClicked

    private void jRadioButton40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton40MouseClicked
        b4 = 5;
    }//GEN-LAST:event_jRadioButton40MouseClicked

    private void jRadioButton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton41MouseClicked
        c1 = 1;
    }//GEN-LAST:event_jRadioButton41MouseClicked

    private void jRadioButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton42MouseClicked
        c1 = 2;
    }//GEN-LAST:event_jRadioButton42MouseClicked

    private void jRadioButton43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton43MouseClicked
        c1 = 3;
    }//GEN-LAST:event_jRadioButton43MouseClicked

    private void jRadioButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton44MouseClicked
        c1 = 4;
    }//GEN-LAST:event_jRadioButton44MouseClicked

    private void jRadioButton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton45MouseClicked
        c1 = 5;
    }//GEN-LAST:event_jRadioButton45MouseClicked

    private void jRadioButton46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton46MouseClicked
        c2 = 1;
    }//GEN-LAST:event_jRadioButton46MouseClicked

    private void jRadioButton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton47MouseClicked
        c2 = 2;
    }//GEN-LAST:event_jRadioButton47MouseClicked

    private void jRadioButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton48MouseClicked
        c2 = 3;
    }//GEN-LAST:event_jRadioButton48MouseClicked

    private void jRadioButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton49MouseClicked
        c2 = 4;
    }//GEN-LAST:event_jRadioButton49MouseClicked

    private void jRadioButton50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton50MouseClicked
        c2 = 5;
    }//GEN-LAST:event_jRadioButton50MouseClicked

    private void jRadioButton51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton51MouseClicked
        c3 = 1;
    }//GEN-LAST:event_jRadioButton51MouseClicked

    private void jRadioButton52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton52MouseClicked
        c3 = 2;
    }//GEN-LAST:event_jRadioButton52MouseClicked

    private void jRadioButton53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton53MouseClicked
        c3 = 3;
    }//GEN-LAST:event_jRadioButton53MouseClicked

    private void jRadioButton54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton54MouseClicked
        c3 = 4;
    }//GEN-LAST:event_jRadioButton54MouseClicked

    private void jRadioButton55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton55MouseClicked
        c3 = 5;
    }//GEN-LAST:event_jRadioButton55MouseClicked

    private void jRadioButton56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton56MouseClicked
        c4 = 1;
    }//GEN-LAST:event_jRadioButton56MouseClicked

    private void jRadioButton57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton57MouseClicked
        c4 = 2;
    }//GEN-LAST:event_jRadioButton57MouseClicked

    private void jRadioButton58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton58MouseClicked
        c4 = 3;
    }//GEN-LAST:event_jRadioButton58MouseClicked

    private void jRadioButton59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton59MouseClicked
        c4 = 4;
    }//GEN-LAST:event_jRadioButton59MouseClicked

    private void jRadioButton60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton60MouseClicked
        c4 = 5;
    }//GEN-LAST:event_jRadioButton60MouseClicked

    private void jRadioButton61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton61MouseClicked
        d1 = 1;
    }//GEN-LAST:event_jRadioButton61MouseClicked

    private void jRadioButton62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton62MouseClicked
        d1 = 2;
    }//GEN-LAST:event_jRadioButton62MouseClicked

    private void jRadioButton63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton63MouseClicked
        d1 = 3;
    }//GEN-LAST:event_jRadioButton63MouseClicked

    private void jRadioButton64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton64MouseClicked
        d1 = 4;
    }//GEN-LAST:event_jRadioButton64MouseClicked

    private void jRadioButton65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton65MouseClicked
        d1 = 5;
    }//GEN-LAST:event_jRadioButton65MouseClicked

    private void jRadioButton66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton66MouseClicked
        d2 = 1;
    }//GEN-LAST:event_jRadioButton66MouseClicked

    private void jRadioButton67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton67MouseClicked
        d2 = 2;
    }//GEN-LAST:event_jRadioButton67MouseClicked

    private void jRadioButton68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton68MouseClicked
        d2 = 3;
    }//GEN-LAST:event_jRadioButton68MouseClicked

    private void jRadioButton69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton69MouseClicked
        d2 = 4;
    }//GEN-LAST:event_jRadioButton69MouseClicked

    private void jRadioButton70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton70MouseClicked
        d2 = 5;
    }//GEN-LAST:event_jRadioButton70MouseClicked

    private void jRadioButton71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton71MouseClicked
        d3 = 1;
    }//GEN-LAST:event_jRadioButton71MouseClicked

    private void jRadioButton72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton72MouseClicked
        d3 = 2;
    }//GEN-LAST:event_jRadioButton72MouseClicked

    private void jRadioButton73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton73MouseClicked
        d3 = 3;
    }//GEN-LAST:event_jRadioButton73MouseClicked

    private void jRadioButton74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton74MouseClicked
        d3 = 4;
    }//GEN-LAST:event_jRadioButton74MouseClicked

    private void jRadioButton75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton75MouseClicked
        d3 = 5;
    }//GEN-LAST:event_jRadioButton75MouseClicked

    private void jRadioButton76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton76MouseClicked
        d4 = 1;
    }//GEN-LAST:event_jRadioButton76MouseClicked

    private void jRadioButton77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton77MouseClicked
        d4 = 2;
    }//GEN-LAST:event_jRadioButton77MouseClicked

    private void jRadioButton78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton78MouseClicked
        d4 = 3;
    }//GEN-LAST:event_jRadioButton78MouseClicked

    private void jRadioButton79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton79MouseClicked
        d4 = 4;
    }//GEN-LAST:event_jRadioButton79MouseClicked

    private void jRadioButton80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton80MouseClicked
        d4 = 5;
    }//GEN-LAST:event_jRadioButton80MouseClicked

    private void jRadioButton81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton81MouseClicked
        e1 = 1;
    }//GEN-LAST:event_jRadioButton81MouseClicked

    private void jRadioButton82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton82MouseClicked
        e1 = 2;
    }//GEN-LAST:event_jRadioButton82MouseClicked

    private void jRadioButton83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton83MouseClicked
        e1 = 3;
    }//GEN-LAST:event_jRadioButton83MouseClicked

    private void jRadioButton84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton84MouseClicked
        e1 = 4;
    }//GEN-LAST:event_jRadioButton84MouseClicked

    private void jRadioButton85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton85MouseClicked
        e1 = 5;
    }//GEN-LAST:event_jRadioButton85MouseClicked

    private void jRadioButton86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton86MouseClicked
        e2 = 1;
    }//GEN-LAST:event_jRadioButton86MouseClicked

    private void jRadioButton87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton87MouseClicked
        e2 = 2;
    }//GEN-LAST:event_jRadioButton87MouseClicked

    private void jRadioButton88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton88MouseClicked
        e2 = 3;
    }//GEN-LAST:event_jRadioButton88MouseClicked

    private void jRadioButton89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton89MouseClicked
        e2 = 4;
    }//GEN-LAST:event_jRadioButton89MouseClicked

    private void jRadioButton90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton90MouseClicked
        e2 = 5;
    }//GEN-LAST:event_jRadioButton90MouseClicked

    private void jRadioButton91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton91MouseClicked
        e3 = 1;
    }//GEN-LAST:event_jRadioButton91MouseClicked

    private void jRadioButton92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton92MouseClicked
        e3 = 2;
    }//GEN-LAST:event_jRadioButton92MouseClicked

    private void jRadioButton93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton93MouseClicked
        e3 = 3;
    }//GEN-LAST:event_jRadioButton93MouseClicked

    private void jRadioButton94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton94MouseClicked
        e3 = 4;
    }//GEN-LAST:event_jRadioButton94MouseClicked

    private void jRadioButton95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton95MouseClicked
        e3 = 5;
    }//GEN-LAST:event_jRadioButton95MouseClicked

    private void jRadioButton96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton96MouseClicked
        e4 = 1;
    }//GEN-LAST:event_jRadioButton96MouseClicked

    private void jRadioButton97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton97MouseClicked
        e4 = 2;
    }//GEN-LAST:event_jRadioButton97MouseClicked

    private void jRadioButton98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton98MouseClicked
        e4 = 3;
    }//GEN-LAST:event_jRadioButton98MouseClicked

    private void jRadioButton99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton99MouseClicked
        e4 = 4;
    }//GEN-LAST:event_jRadioButton99MouseClicked

    private void jRadioButton100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton100MouseClicked
        e4 = 5;
    }//GEN-LAST:event_jRadioButton100MouseClicked

    private void btnNextInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextInputActionPerformed
        jumlahAnggota();
        int cpt = contributionChecker();
        int tmp1 = radioButtonNumber(jumlahteam);
        int tmp2 = totalRadioButton(jumlahteam);
        
        if(tmp2>=tmp1 && cpt==100){
            try {
                switch (jumlahteam) {
                    case 5:
                        ar = Integer.parseInt(inRatio1.getText());
                        br = Integer.parseInt(inRatio2.getText());
                        cr = Integer.parseInt(inRatio3.getText());
                        dr = Integer.parseInt(inRatio4.getText());
                        er = Integer.parseInt(inRatio5.getText());
                        tadi.setNilaia(a1, a2, a3, a4, ar);
                        tadi.setNilaib(b1, b2, b3, b4, br);
                        tadi.setNilaic(c1, c2, c3, c4, cr);
                        tadi.setNilaid(d1, d2, d3, d4, dr);
                        tadi.setNilaie(e1, e2, e3, e4, er);
                        break;
                    case 4:
                        ar = Integer.parseInt(inRatio1.getText());
                        br = Integer.parseInt(inRatio2.getText());
                        cr = Integer.parseInt(inRatio3.getText());
                        dr = Integer.parseInt(inRatio4.getText());
                        tadi.setNilaia(a1, a2, a3, a4, ar);
                        tadi.setNilaib(b1, b2, b3, b4, br);
                        tadi.setNilaic(c1, c2, c3, c4, cr);
                        tadi.setNilaid(d1, d2, d3, d4, dr);
                        break;
                    case 3:
                        ar = Integer.parseInt(inRatio1.getText());
                        br = Integer.parseInt(inRatio2.getText());
                        cr = Integer.parseInt(inRatio3.getText());
                        tadi.setNilaia(a1, a2, a3, a4, ar);
                        tadi.setNilaib(b1, b2, b3, b4, br);
                        tadi.setNilaic(c1, c2, c3, c4, cr);
                        break;
                    case 2:
                        ar = Integer.parseInt(inRatio1.getText());
                        br = Integer.parseInt(inRatio2.getText());
                        tadi.setNilaia(a1, a2, a3, a4, ar);
                        tadi.setNilaib(b1, b2, b3, b4, br);
                        break;
                    default:
                        ar = Integer.parseInt(inRatio1.getText());
                        tadi.setNilaia(a1, a2, a3, a4, ar);
                        break;
                }
                clearField();
                ratioSetter();

                if (rollnumber > jumlahAnggota()) {
                    String str1 = "Kelompok anda telah selesai mengisi nilai! \n\n";
                    String str2 = "Silakan berikan pc ke dosen penilai\n";
                    String str3 = "untuk memberikan nilai team";
                    JOptionPane.showMessageDialog(rootPane, str1 + str2 + str3);
                } 
                else {
                    setFormNumber();
                    String str1 = "Silakan berikan PC ke anggota team selanjutnya\n";
                    String str2 = "untuk mengisikan nilai team";
                    JOptionPane.showMessageDialog(rootPane, str1 + str2);
                }
            }
            catch(Exception e){
                String stre1 = "Error, ada komponen yang kosong\n";
                String stre2 = "silakan masukan ulang nilai kelompok anda";
                String ultstre = stre1+stre2;
                JOptionPane.showMessageDialog(rootPane, ultstre);
                clearField();
            }
        }
        else {
            String stre1 = "Error, jumlah contribution tidak sama dengan 100!\n";
            String stre2 = "       atau ada komponen nilai yang belum diisi";
            String stre3 = "Silakan masukan ulang data nilai";
            String ultstre = stre1+stre2+stre3;
            JOptionPane.showMessageDialog(rootPane, ultstre);
            clearField();
            ratioSetter();
        }
        
    }//GEN-LAST:event_btnNextInputActionPerformed

    private void btnCekNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekNilaiActionPerformed
        jumlahAnggota();

        switch (jumlahteam) {
            case 5:
                {
                    String display1 = nama1 + tadi.getNilaia();
                    String display2 = nama2 + tadi.getNilaib();
                    String display3 = nama3 + tadi.getNilaic();
                    String display4 = nama4 + tadi.getNilaid();
                    String display5 = nama5 + tadi.getNilaie();
                    String ultdisplay = display1 + display2 + display3 + display4 + display5;
                    JOptionPane.showMessageDialog(rootPane, ultdisplay);
                    break;
                }
            case 4:
                {
                    String display1 = nama1 + tadi.getNilaia();
                    String display2 = nama2 + tadi.getNilaib();
                    String display3 = nama3 + tadi.getNilaic();
                    String display4 = nama4 + tadi.getNilaid();
                    String ultdisplay = display1 + display2 + display3 + display4;
                    JOptionPane.showMessageDialog(rootPane, ultdisplay);
                    break;
                }
            case 3:
                {
                    String display1 = tadi.getNilaia();
                    String display2 = tadi.getNilaib();
                    String display3 = tadi.getNilaic();
                    String ultdisplay = display1 + display2 + display3;
                    JOptionPane.showMessageDialog(rootPane, ultdisplay);
                    break;
                }
            case 2:
                {
                    String display1 = tadi.getNilaia();
                    String display2 = tadi.getNilaib();
                    String ultdisplay = display1 + display2;
                    JOptionPane.showMessageDialog(rootPane, ultdisplay);
                    break;
                }
            default:
                {
                    String display1 = tadi.getNilaia();
                    String ultdisplay = display1;
                    JOptionPane.showMessageDialog(rootPane, ultdisplay);
                    break;
                }
        }
    }//GEN-LAST:event_btnCekNilaiActionPerformed

    private void btnClearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFieldActionPerformed
        clearField();
    }//GEN-LAST:event_btnClearFieldActionPerformed

    private void btnToExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToExcelActionPerformed
        int alol = tadi.jumlahNilaiA();
        int blol = tadi.jumlahNilaiB();
        int clol = tadi.jumlahNilaiC();
        int dlol = tadi.jumlahNilaiD();
        int elol = tadi.jumlahNilaiE();
               
        switch (jumlahteam) {
            case 5:
                {
                    DatabaseNilai siswaa = new DatabaseNilai(namat, nama1, tadi.getA1(), tadi.getA2(),
                            tadi.getA3(), tadi.getA4(), alol, tadi.getAr());
                    lowl.add(siswaa);
                    DatabaseNilai siswab = new DatabaseNilai(namat, nama2, tadi.getB1(), tadi.getB2(),
                            tadi.getB3(), tadi.getB4(), blol, tadi.getBr());
                    lowl.add(siswab);
                    DatabaseNilai siswac = new DatabaseNilai(namat, nama3, tadi.getC1(), tadi.getC2(),
                            tadi.getC3(), tadi.getC4(), clol, tadi.getCr());
                    lowl.add(siswac);
                    DatabaseNilai siswad = new DatabaseNilai(namat, nama4, tadi.getD1(), tadi.getD2(),
                            tadi.getD3(), tadi.getD4(), dlol, tadi.getDr());
                    lowl.add(siswad);
                    DatabaseNilai siswae = new DatabaseNilai(namat, nama5, tadi.getE1(), tadi.getE2(),
                            tadi.getE3(), tadi.getE4(), elol, tadi.getEr());
                    lowl.add(siswae);
                    break;
                }
            case 4:
                {
                    DatabaseNilai siswaa = new DatabaseNilai(namat, nama1, tadi.getA1(), tadi.getA2(),
                            tadi.getA3(), tadi.getA4(), alol, tadi.getAr());
                    lowl.add(siswaa);
                    DatabaseNilai siswab = new DatabaseNilai(namat, nama2, tadi.getB1(), tadi.getB2(),
                            tadi.getB3(), tadi.getB4(), blol, tadi.getBr());
                    lowl.add(siswab);
                    DatabaseNilai siswac = new DatabaseNilai(namat, nama3, tadi.getC1(), tadi.getC2(),
                            tadi.getC3(), tadi.getC4(), clol, tadi.getCr());
                    lowl.add(siswac);
                    DatabaseNilai siswad = new DatabaseNilai(namat, nama4, tadi.getD1(), tadi.getD2(),
                            tadi.getD3(), tadi.getD4(), dlol, tadi.getDr());
                    lowl.add(siswad);
                    break;
                }
            case 3:
                {
                    DatabaseNilai siswaa = new DatabaseNilai(namat, nama1, tadi.getA1(), tadi.getA2(),
                            tadi.getA3(), tadi.getA4(), alol, tadi.getAr());
                    lowl.add(siswaa);
                    DatabaseNilai siswab = new DatabaseNilai(namat, nama2, tadi.getB1(), tadi.getB2(),
                            tadi.getB3(), tadi.getB4(), blol, tadi.getBr());
                    lowl.add(siswab);
                    DatabaseNilai siswac = new DatabaseNilai(namat, nama3, tadi.getC1(), tadi.getC2(),
                            tadi.getC3(), tadi.getC4(), clol, tadi.getCr());
                    lowl.add(siswac);
                    break;
                }
            case 2:
                {
                    DatabaseNilai siswaa = new DatabaseNilai(namat, nama1, tadi.getA1(), tadi.getA2(),
                            tadi.getA3(), tadi.getA4(), alol, tadi.getAr());
                    lowl.add(siswaa);
                    DatabaseNilai siswab = new DatabaseNilai(namat, nama2, tadi.getB1(), tadi.getB2(),
                            tadi.getB3(), tadi.getB4(), blol, tadi.getBr());
                    lowl.add(siswab);
                    break;
                }
            default:
                {
                    DatabaseNilai siswaa = new DatabaseNilai(namat, nama1, tadi.getA1(), tadi.getA2(),
                            tadi.getA3(), tadi.getA4(), alol, tadi.getAr());
                    lowl.add(siswaa);
                    break;
                }
        }
        
        HSSFSheet fSheet = null;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tgl = new Date();
        String tglrl = dateFormat.format(tgl);
        
        try {
            HSSFWorkbook fWorkbook = new HSSFWorkbook();
            fSheet = fWorkbook.createSheet("buat test");
            HSSFFont sheetTitleFont = fWorkbook.createFont();
            File file = new File("D:\\final"+tglrl+".xls");
            HSSFCellStyle cellStyle = fWorkbook.createCellStyle();

            sheetTitleFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); 

            HSSFRow header1 = fSheet.createRow(0);
                    
            for(int i = 0; i<8; i++){
                HSSFCell header = header1.createCell((short) i);
                switch (i) {
                    case 0:
                        header.setCellValue("Nama Team");
                        break;
                    case 1:
                        header.setCellValue("Nama Siswa");
                        break;
                    case 2:
                        header.setCellValue("Quality");
                        break;
                    case 3:
                        header.setCellValue("Quantity");
                        break;
                    case 4:
                        header.setCellValue("Timeliness");
                        break;
                    case 5:
                        header.setCellValue("Level");
                        break;
                    case 6:
                        header.setCellValue("Nilai Total");
                        break;
                    case 7:
                        header.setCellValue("Contribution");
                        break;
                    default:
                        break;
                }
                header.setCellStyle(cellStyle);
            }
            
            for (int i = 1; i < lowl.size()+1; i++) {
                HSSFRow fRow = fSheet.createRow((short) i);
                for (int j = 0; j < 8; j++) {
                    HSSFCell cell = fRow.createCell((short) j);
                    switch (j) {
                        case 0:
                            cell.setCellValue(lowl.get(i-1).getNamaGroup());
                            break;
                        case 1:
                            cell.setCellValue(lowl.get(i-1).getNama());
                            break;
                        case 2:
                            cell.setCellValue(lowl.get(i-1).getNilaiA());
                            break;
                        case 3:
                            cell.setCellValue(lowl.get(i-1).getNilaiB());
                            break;
                        case 4:
                            cell.setCellValue(lowl.get(i-1).getNilaiC());
                            break;
                        case 5:
                            cell.setCellValue(lowl.get(i-1).getNilaiD());
                            break;
                        case 6:
                            cell.setCellValue(lowl.get(i-1).getNilaiTotal());
                            break;
                        case 7:
                            cell.setCellValue(lowl.get(i-1).getRatioTotal());
                            break;
                        default:
                            break;
                    }
                    //cell.setCellValue(lowl.get(i).toString());
                    cell.setCellStyle(cellStyle);
                }
            }
            
            FileOutputStream fileOutputStream;
            fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            fWorkbook.write(bos);
            bos.close();
            fileOutputStream.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnToExcelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekNilai;
    private javax.swing.JButton btnClearField;
    private javax.swing.JButton btnMenuAwal;
    private javax.swing.JButton btnNextInput;
    private javax.swing.JButton btnToExcel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField inNama1;
    private javax.swing.JTextField inNama2;
    private javax.swing.JTextField inNama3;
    private javax.swing.JTextField inNama4;
    private javax.swing.JTextField inNama5;
    private javax.swing.JTextField inNamaTeam;
    private javax.swing.JTextField inRatio1;
    private javax.swing.JTextField inRatio2;
    private javax.swing.JTextField inRatio3;
    private javax.swing.JTextField inRatio4;
    private javax.swing.JTextField inRatio5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JLabel outFormNumber;
    private javax.swing.JLabel outFormTotal;
    // End of variables declaration//GEN-END:variables
}
