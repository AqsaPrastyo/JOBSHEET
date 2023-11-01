package jawabajobsheet21;
import java.util.Scanner;
public class InventoryRestaurant1C {
  
  public static void main(String[] args) {

    Scanner inven = new Scanner(System.in);

    String correctUsername = "sarah";
    String correctPassword = "sarah123";

    String username, password;

    System.out.println("\n\n=========================Login Menu=========================");
    System.out.print("Username: ");
    username = inven.nextLine();
    System.out.print("Password: ");
    password = inven.nextLine();
    System.out.println("============================================================");

    if (username.equals(correctUsername)) {
      if (password.equals(correctPassword)) {
        int pilihMenu;

        do {
          System.out.println("\n\n=========================Pilih Menu=========================");
          System.out.println("1. Data Barang");
          System.out.println("2. Input Data Barang");
          System.out.println("3. Update Data Barang");
          System.out.println("4. Pencarian Data Barang");
          System.out.println("5. Laporan Data Barang");
          System.out.println("6. Keluar");
          System.out.println("============================================================");
          System.out.print("Pilih Menu : ");
          pilihMenu = inven.nextInt();

        // data barang
        int daging = 29, jus = 10, kompor = 6, meja = 24, kursi = 48, panci = 5, piring = 64, sapu = 2,
        mangkok = 4, komputer = 2;

        int a = 0;

        // barang rusak
        int daging1 = 0, jus1 = 0, kompor1 = 0, meja1 = 5, kursi1 = 4, panci1 = 3, piring1 = 5, sapu1 = 1,
        mangkok1 = 0, komputer1 = 1;
        int b = 0;

          switch (pilihMenu) {
            case 1:
              // Tampilkan Data Barang
              // (Tambahkan kode untuk menampilkan data di sini)
              System.out.println("\n\n========================Data Barang=========================");
              System.out.println("\nNO\t NAMA \t\t\t|\t\tJUMLAH\n");
              System.out.println(++a + "\t Daging \t\t|\t\t" + daging);
              System.out.println(++a + "\t Jus \t\t\t|\t\t" + jus);
              System.out.println(++a + "\t Kompor \t\t|\t\t" + kompor);
              System.out.println(++a + "\t Kursi \t\t\t|\t\t" + kursi);
              System.out.println(++a + "\t Komputer \t\t|\t\t" + komputer);
              System.out.println(++a + "\t Mangkok \t\t|\t\t" + mangkok);
              System.out.println(++a + "\t Meja \t\t\t|\t\t" + meja);
              System.out.println(++a + "\t Panci \t\t\t|\t\t" + panci);
              System.out.println(++a + "\t Piring \t\t|\t\t" + piring);
              System.out.println(++a + "\t Sapu \t|\t\t" + jus);
              System.out.println("============================================================");

              // Tanyakan kepada pengguna apakah mereka ingin kembali ke menu utama
              System.out.print("Apakah anda ingin kembali (y/n): ");
              String kembaliKeMenu = inven.next();
              break;

            case 2:
              int pilihMenu2;

              do {
                System.out.println("\n=====================Input Data Barang======================");
                System.out.println("1. Barang Masuk");
                System.out.println("2. Barang Keluar");
                System.out.println("3. Barang Rusak");
                System.out.println("4. Kembali");
                System.out.print("\nPilih Menu (1/2/3/4) : ");
                pilihMenu2 = inven.nextInt();

                switch (pilihMenu2) {
                  case 1:
                    // Barang Masuk
                    // (Tambahkan kode untuk memasukkan data Barang masuk di sini)
                    
                    System.out.println("=======================Barang Masuk=========================\n");

                    String konfirmasi;
    
                    do {
                      System.out.print("Input Barang Masuk : ");
                      String barangMasuk = inven.next();
                      System.out.print("Jumlah Input : ");
                      int jmlBarangMasuk = inven.nextInt();
    
                      if (barangMasuk.equalsIgnoreCase("daging")) {
                        daging += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + daging);
                      } else if (barangMasuk.equalsIgnoreCase("jus")) {
                        jus += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + jus);
                      } else if (barangMasuk.equalsIgnoreCase("kompor")) {
                        kompor += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + kompor);
                      } else if (barangMasuk.equalsIgnoreCase("kursi")) {
                        kursi += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + kursi);
                      } else if (barangMasuk.equalsIgnoreCase("komputer")) {
                        komputer += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + komputer);
                      } else if (barangMasuk.equalsIgnoreCase("mangkok")) {
                        mangkok += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + mangkok);
                      } else if (barangMasuk.equalsIgnoreCase("meja")) {
                        meja += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + meja);
                      } else if (barangMasuk.equalsIgnoreCase("panci")) {
                        panci += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + panci);
                      } else if (barangMasuk.equalsIgnoreCase("piring")) {
                        piring += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + piring);
                      } else if (barangMasuk.equalsIgnoreCase("Sapu")) {
                        sapu += jmlBarangMasuk;
                        System.out.println("Total barang " + barangMasuk + " menjadi : " + sapu);
                      } else {
                        System.out.println("Nama Barang Tidak Tersedia\n");
    
                      }
                      Scanner inven2 = new Scanner(System.in);
                      System.out.print("Apakah anda ingin input barang lagi (y/n)?");
                      konfirmasi = inven2.nextLine();
    
                    } while (konfirmasi.equalsIgnoreCase("y"));

                    break;

                  case 2:
                    // Barang Keluar
                    // (Tambahkan kode untuk memasukkan data Barang keluar di sini)

                    System.out.println("========================Barang Keluar=======================\n");

                    do {
                      System.out.print("Input Barang Keluar : ");
                      String barangKeluar = inven.next();
                      System.out.print("Jumlah Input : ");
                      int jmlBarangKeluar = inven.nextInt();
    
                      if (barangKeluar.equalsIgnoreCase("daging")) {
                        daging -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + daging);
                      } else if (barangKeluar.equalsIgnoreCase("jus")) {
                        jus -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + jus);
                      } else if (barangKeluar.equalsIgnoreCase("kompor")) {
                        kompor -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + kompor);
                      } else if (barangKeluar.equalsIgnoreCase("kursi")) {
                        kursi -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + kursi);
                      } else if (barangKeluar.equalsIgnoreCase("komputer")) {
                        komputer -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + komputer);
                      } else if (barangKeluar.equalsIgnoreCase("mangkok")) {
                        mangkok -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + mangkok);
                      } else if (barangKeluar.equalsIgnoreCase("meja")) {
                        meja -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + meja);
                      } else if (barangKeluar.equalsIgnoreCase("panci")) {
                        panci -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + panci);
                      } else if (barangKeluar.equalsIgnoreCase("piring")) {
                        piring -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + piring);
                      } else if (barangKeluar.equalsIgnoreCase("Sapu")) {
                        sapu -= jmlBarangKeluar;
                        System.out.println("Total barang " + barangKeluar + " menjadi : " + sapu);
                      } else {
                        System.out.println("Nama Barang Tidak Tersedia\n");
                      }
                      Scanner inven2 = new Scanner(System.in);
                      System.out.println("Apakah anda ingin input barang lagi (y/t)?");
                      konfirmasi = inven2.nextLine();
    
                    } while (konfirmasi.equalsIgnoreCase("y"));
    

                    break;

                  case 3:
                    // Barang Rusak
                    // (Tambahkan kode untuk memasukkan data Barang rusak di sini)

                    System.out.println("========================Barang Rusak========================\n");
                    do {
                      System.out.print("Input Barang Rusak : ");
                      String barangRusak = inven.next();
                      System.out.print("Jumlah Input : ");
                      int jmlBarangRusak = inven.nextInt();
    
                      if (barangRusak.equalsIgnoreCase("daging")) {
                        daging1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + daging1);
                      } else if (barangRusak.equalsIgnoreCase("jus")) {
                        jus1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + jus1);
                      } else if (barangRusak.equalsIgnoreCase("kompor")) {
                        kompor1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + kompor1);
                      } else if (barangRusak.equalsIgnoreCase("kursi")) {
                        kursi1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + kursi1);
                      } else if (barangRusak.equalsIgnoreCase("komputer")) {
                        komputer1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + komputer1);
                      } else if (barangRusak.equalsIgnoreCase("mangkok")) {
                        mangkok1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + mangkok1);
                      } else if (barangRusak.equalsIgnoreCase("meja")) {
                        meja1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + meja1);
                      } else if (barangRusak.equalsIgnoreCase("panci")) {
                        panci1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + panci1);
                      } else if (barangRusak.equalsIgnoreCase("piring")) {
                        piring1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + piring1);
                      } else if (barangRusak.equalsIgnoreCase("Sapu")) {
                        sapu1 -= jmlBarangRusak;
                        System.out.println("Total barang " + barangRusak + " menjadi : " + sapu1);
                      } else {
                        System.out.println("Nama Barang Tidak Tersedia\n");
                      }
    
                      Scanner inven2 = new Scanner(System.in);
                      System.out.println("Apakah anda ingin input barang lagi (y/t)?");
                      konfirmasi = inven2.nextLine();
    
                    } while (konfirmasi.equalsIgnoreCase("y"));
    

                    break;

                  case 4:
                    // Kembali ke Menu Utama
                    break;

                  default:
                    System.out.println("Pilihan tidak valid");
                    break;
                }
              } while (pilihMenu2 != 4);

              break;

            case 3:
              // Update Data Barang
              // (Tambahkan kode untuk memperbarui data di sini)

              System.out.println("\n\n=====================Update Data Barang=====================");
              System.out.println("\nNO\t NAMA \t\t\t|\t\tJUMLAH\n");
              System.out.println(++b + "\t Kursi \t\t\t|\t\t" + kursi1);
              System.out.println(++b + "\t Komputer \t\t|\t\t" + komputer1);
              System.out.println(++b + "\t Meja \t\t\t|\t\t" + meja1);
              System.out.println(++b + "\t Panci \t\t\t|\t\t" + panci1);
              System.out.println(++b + "\t Piring \t\t|\t\t" + piring1);
              System.out.println(++b + "\t Sapu \t|\t\t" + sapu1);
              System.out.println("============================================================");

              // Tanyakan kepada pengguna apakah mereka ingin kembali ke menu utama
              System.out.print("Apakah anda ingin kembali (y/n): ");
              kembaliKeMenu = inven.next();
              break;

            case 4:
              // Pencarian Data Barang
              // (Add the code for searching data here)

              System.out.print("Masukkan nama barang yang ingin dicari: ");
              inven.nextLine(); 
              String barangCari = inven.nextLine();
          
              if (barangCari.equalsIgnoreCase("Daging")) {
              System.out.println("Jumlah Barang  :" +daging);
              } else if (barangCari.equalsIgnoreCase("Jus")) {
                System.out.println("Jumlah Barang :" +jus);
              } else if (barangCari.equalsIgnoreCase("Kompor")) {
               System.out.println("Jumlah Barang:" +kompor);
              } else if (barangCari.equalsIgnoreCase("Kursi")){
                System.out.println("Jumlah Barang:" +kursi);
              }else if(barangCari.equalsIgnoreCase("Komputer")){
                System.out.println("Jumlah Barang: "+komputer);
              }else if (barangCari.equalsIgnoreCase("mangkok")){
                System.out.println("Jumlah Barang: "+mangkok);
              }else if(barangCari.equalsIgnoreCase("Meja")){
                System.out.println("Jumlah Barang: "+meja);
              }else if(barangCari.equalsIgnoreCase("Panci")){
                System.out.println("Jumlah Barang: "+panci);
              }else if(barangCari.equalsIgnoreCase("Piring")){
                System.out.println("Jumlah Barang: "+piring);
              }else if(barangCari.equalsIgnoreCase("sapu")){
                System.out.println("Jumlah Barang: "+sapu);
              }else {
                System.out.println("Barang tidak ditemukan.");
              }

              // Tanyakan kepada pengguna apakah mereka ingin kembali ke menu utama
              System.out.print("Apakah anda ingin kembali (y/n): ");
              kembaliKeMenu = inven.next();
              break;

            case 5:
              // Laporan Data Barang
              // (Tambahkan kode untuk membuat laporan di sini)

              // Tanyakan kepada pengguna apakah mereka ingin kembali ke menu utama
              System.out.print("Apakah anda ingin kembali (y/n): ");
              kembaliKeMenu = inven.next();
              break;

            case 6:
              // Keluar
              System.out.println("Terima kasih! Keluar dari program.");
              break;

            default:
              System.out.println("Pilihan tidak valid");
              break;
          }
        } while (pilihMenu != 6);

      }
    } else {
      System.out.println("\n Login failed. Please check your username and password.");
    }
  }
}


