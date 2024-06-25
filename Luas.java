public class Luas {

    double sisi1;
    double sisi2;
    double Tinggi;

   Luas (String sisi1, String sisi2, String Tinggi){
       this.sisi1 = Double.parseDouble(sisi1);
       this.sisi2 = Double.parseDouble(sisi2);
       this.Tinggi = Double.parseDouble(Tinggi);
    }
    public double Hitungluas(){
        return (this.sisi1 + this.sisi2 ) * this.Tinggi /2;
    }
    public double HitungKeliling(){
        return ( this.sisi1 + this.sisi2 + this.sisi1 + this.sisi2);
    }
}
