public class LearnNotPrimitifDT {
    public static void main(String[] args) {

        // Type data non primitiv diartikan bahwa default variable dapat berupa null,
        // semua type data kecuali String adalah data primitiv untuk dapat diubah jadi
        // bukan data primiv tinggal kasih huruf besar di awal

        Integer intNoPrimitiv;
        intNoPrimitiv = 100;

        System.out.print(intNoPrimitiv);

        //Konversi dari data tipe primitif
        int age = 22;
        Integer ageKonversi = age;

        int ageBalikkan = ageKonversi;

        //Konversi dari int ke Integer tidak akan ada masalah namun jika kebalikkan maka butuh .intValue()
        short keShortAge = ageKonversi.shortValue();
        byte byteAge = ageKonversi.byteValue();

        System.out.println(ageBalikkan+keShortAge+byteAge);
    }

}
