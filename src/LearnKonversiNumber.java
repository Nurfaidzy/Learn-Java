public class LearnKonversiNumber {
    public static void main(String[] args) {
        // konversi ini dilakukan secara otomatis karena dari terkecil ke besar
        byte iniByte = 10;
        short iniShort = iniByte;
        int intInt = iniShort;
        System.out.println(intInt);

        // Konversi Manual jika dari atas ke bawah

        byte iniByte2 = (byte) intInt;
        
        System.out.println(iniByte2);
    }
    
}
