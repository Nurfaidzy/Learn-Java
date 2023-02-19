public class ExampleOop {
    // Buat vanding machine pocari sweet
    // jadi ada mesin yang bisa rekam duit 100000,50000,20000,10000,5000
    // minumannya ada 3 jenis harga v1 6000, v2 12000 v3 15000

    static String cekUang(int diTerima) {
        int[] tipeUang = { 100000, 50000, 20000, 10000, 5000 };
        String status = "";
        Integer check = diTerima;
        for (int i = 0; i < tipeUang.length; i++) {
            if (diTerima >= tipeUang[i]) {
                check = check - tipeUang[i];
                if (check != 0) {
                    cekUang(check);
                } else {
                    status = "uang yang dimasukkan benar";
                }
            } else {
                status = "uang yang dimasukkan salah";
            }

        }
        return status;
    }

    static int cekKembalian(String kodeProduk, int uang) {
        int kembali = 0;
        switch (kodeProduk) {
            case "V1":
                kembali = uang - 6000;
                break;
            case "V2":
                kembali = uang - 12000;
                break;
            case "V3":
                kembali = uang - 15000;
            default:
                kembali = 0;
                break;
        }
        return kembali;

    }

    public static void main(String[] args) {
        int uang = 1000;
        String produkDipilih = "V2";
        String indektikalUang = cekUang(uang);
        System.out.println(indektikalUang);
        switch (indektikalUang) {
            case "uang yang dimasukkan benar":
                System.out.println("Kembalian : ");
                System.out.println(cekKembalian(produkDipilih, uang));
                break;
            default:
                break;
        }
    }
}
