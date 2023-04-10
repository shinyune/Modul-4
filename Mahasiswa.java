import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {

    String nama,kelas,matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int n1){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = n1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1",new Mahasiswa("Putri","3H","Struktur Data",2020008));
        mhs.put("2",new Mahasiswa("Agus","3A","Matematika",2020012));
        mhs.put("3",new Mahasiswa("Arro","3D","Pemograman",2020017));

        System.out.println("Masukkan ID");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : "+data.nama + " Kelas : "+data.kelas+
            " Mata kulaih praktikum : "+data.matkulPraktikum+" NIM : "+data.nim);
        }
    }
}