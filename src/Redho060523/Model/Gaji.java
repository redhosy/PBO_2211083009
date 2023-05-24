/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redho060523.Model;
/**
 *
 * @author septa
 */
public class Gaji{
    private Karyawan karyawan;
    private String bulan;
    private String tahun;
    private double gajipokok;
    private double tunjangananak;
    private double tunjanganistri;
    private double totalgaji;
    public Gaji(){
}
public Gaji(Karyawan karyawan, String bulan, String tahun) {
        this.karyawan = karyawan;
        this.bulan = bulan;
        this.tahun = tahun;
        setgajipokok(""+karyawan.getgolongan());
        settunjangananak(karyawan);
        settunjanganistri(karyawan);
        settotalgaji();
    }
    
    public Karyawan getKaryawan(){
        return karyawan;
        }
    public String getbulan(){
        return bulan;
        }
    public String gettahun(){
        return tahun;
        }
    public double getgajipokok(){
        return gajipokok;
    }
    public double gettunjangananak(){
        return tunjangananak;
        }   
    public double gettunjanganistri(){
        return tunjanganistri;
        }
    public double gettotalgaji(){
        return totalgaji;
        }   

      public void setKaryawan(Karyawan karyawan ) {
            this.karyawan = karyawan;
        }
      public void setbulan(String bulan) {
            this.bulan = bulan;
        }
      public void settahun(String tahun) {
            this.tahun = tahun;
        }
      public void setgajipokok(String golongan){
          double gajipokok;
           switch(golongan){
            case "1":
                this.gajipokok = 1500000;
                break;
            case "2":
                this.gajipokok = 2250000;
                break;
            case "3":
                this.gajipokok = 3000000;
                break;
            case "4":
                this.gajipokok = 4000000;
                break;
            default :
                this.gajipokok =  0;
        }
      }
      
      public void settunjangananak(Karyawan karyawan){
        if(karyawan.getjumlahanak()>0){
            this.tunjangananak = 0.1 * gajipokok *karyawan.getjumlahanak();   
          }else{
              this.tunjangananak =  0;
          }   
      }
       
      public void settunjanganistri(Karyawan karyawan){
          if(karyawan.getstatusNikah().equals("nikah")){
            this.tunjanganistri = 0.1 * gajipokok;   
          }else{
              this.tunjanganistri =  0;
          } 
        }
      public void settotalgaji(){
            this.totalgaji = gajipokok + tunjanganistri + tunjangananak;  
          
    }
}

