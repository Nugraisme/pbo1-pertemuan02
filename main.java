import koneksi.Database;
import model.Mahasiswa;
import model.Dosen;
import model.Matakuliah;

public class main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Dosen.tampilaninfo();
  Mahasiswa.tampilaninfo();
  Matakuliah.tampilaninfo();
 }
}