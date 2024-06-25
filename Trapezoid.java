import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trapezoid {
    public static void main(String[] args) {
    String namafile = "C:\\Users\\MONG\\IdeaProjects\\UASPL\\src\\Trapesium.txt";
    String outputfile = "C:\\Users\\MONG\\IdeaProjects\\UASPL\\src\\KelilingBlmDiurut.txt";
        List<Luas> tr = new ArrayList<>();

        try{
            BufferedReader nr = new BufferedReader(new FileReader(namafile));
            String line;
            nr.readLine();
            while ((line = nr.readLine()) != null ){
                String [] row = line.split(",");
                Luas pr = new Luas(row[0],row[1],row[2]);
                tr.add(pr);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        try{
            FileWriter po = new FileWriter(outputfile);
            for (Luas trt : tr){
                double luas = trt.Hitungluas();
                double Keliling = trt.HitungKeliling();
                System.out.println("Luas Trapesium : " + luas);
                po.write(Keliling + "\n");
            }
            System.out.println("Untuk Keliling Di tulis Di File txt");

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
        }
}
