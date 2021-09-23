package SetterGetter;
import java.util.Scanner;

class Nilai {
    Scanner input = new Scanner(System.in);
    boolean kelulusan = true;
    int nilaiTugas1, nilaiTugas2, nilaiTugas3, nilaiUTS, nilaiUAS; 
    float nilaiAkhir;
    // Constructor
    Nilai() {
        System.out.println("Nilai Tugas 25%");
        System.out.println("Nilai UTS 35%");
        System.out.println("Nilai UTS 40%");
    }
    // Fungsi Input Nilai
    void Input() {
        System.out.print("Nilai Tugas 1 : ");
        nilaiTugas1 = input.nextInt();
        System.out.print("Nilai Tugas 2 : ");
        nilaiTugas2 = input.nextInt();
        System.out.print("Nilai Tugas 3 : ");
        nilaiTugas3 = input.nextInt();
        System.out.print("Nilai UTS : ");
        nilaiUTS = input.nextInt();
        System.out.print("Nilai UAS : ");
        nilaiUAS = input.nextInt();
    }
    // Fungsi Penghitung Nilai
    void Hitung() {
        nilaiAkhir = (nilaiTugas1 + nilaiTugas2 + nilaiTugas3) / 3 * 25 / 100;
        nilaiAkhir += nilaiUTS * 35 / 100;
        nilaiAkhir += nilaiUAS * 40 / 100;
        if (nilaiAkhir >= 80) {
            kelulusan = true;
        } else {
            kelulusan = false;
        }
    }
    // Fungsi Penentu Kelulusan
    String Kelulusan() {
        if (kelulusan) {
            return ("Selamat, Anda Dinyatakan Lulus!");
        } else {
            return ("Maaf, Anda Dinyatakan Tidak Lulus!");
        }
    }
}

public class Bima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        while (true) {
            Header();
            System.out.println("1. Input Nilai");
            System.out.println("2. Exit");
            System.out.print("Pilih Menu > ");
            menu = input.nextInt();
            if (menu == 1) {
                Header();
                Nilai mahasiswa = new Nilai();
                mahasiswa.Input();
                mahasiswa.Hitung();
                System.out.println("Nilai Akhir Anda Adalah " + mahasiswa.nilaiAkhir);
                System.out.println(mahasiswa.Kelulusan());
                System.out.println("1. Kembali");
                System.out.println("2. Exit");
                System.out.print("Pilih Menu > ");
                menu = input.nextInt();
                if (menu == 1) {
                    continue;
                } else {
                    Closer();
                    break;
                }
            } else {
                Closer();
                break;
            }
        }
    }
    static void Header() {
        System.out.print("\033[H\033[2J");
        System.out.println(" = = = Nilai Mahasiswa = = = ");
    }
    static void Closer() {
        System.out.print("\033[H\033[2J");
        System.out.println("Terima Kasih!");
    }
}
