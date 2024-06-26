import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trapezoid2 {
    public static void main(String[] args) {
        String nama = "C:\\Users\\MONG\\IdeaProjects\\UASPL\\src\\KelilingBlmDiurut.txt";
        List<Double>dandy = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nama))){
            String line;
            while ((line = br.readLine()) != null){
                dandy.add(Double.parseDouble(line));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        String FileUrut = "C:\\Users\\MONG\\IdeaProjects\\UASPL\\src\\KelilingYangTelatDiUrut.txt";
        String Fleblm = "C:\\Users\\MONG\\IdeaProjects\\UASPL\\src\\KelilingBlmDiurut.txt";
        try (FileWriter dop= new FileWriter(Fleblm)){
            for (double kelilng : dandy){
                dop.write(kelilng + "\n");
            }
            System.out.println("DiFile yang telah di urut");
        }catch (IOException e){
            System.err.println(e.getMessage());

        }
        try(FileWriter fw = new FileWriter(FileUrut)){
            int p = dandy.size();
            for (int i = 0; i < p - 1; i++) {
                for (int j = 0; j < p - i - 1; j++) {
                    if(dandy.get(j) > dandy.get(j + 1)){
                        Double Penyimpanan = dandy.get(j);
                        dandy.set(j, dandy.get(j + 1));
                        dandy.set(j + 1, Penyimpanan);

                    }
                }
            }
            for (double kelilng : dandy){
                fw.write(kelilng + "\n");
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
