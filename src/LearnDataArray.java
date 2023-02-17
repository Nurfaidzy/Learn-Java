public class LearnDataArray {
    public static void main(String[] args) {
        //ini penggunaan java untuk penginsialisasi string
        String[] arrayStrings;
        arrayStrings = new String[3];
        arrayStrings[0]="si ENOL";
        arrayStrings[1]="Si Dua";
        arrayStrings[2]="Si Tiga";

        System.out.println(arrayStrings[0]);

        //ini kode untuk inisialisasi array
        String[] arraStrings2 = {"satu","dua","tiga"};
        System.out.println(arraStrings2[1]);

        //melakukan pengubahan data erray
        arraStrings2[2]="keempatlah";
        System.out.println(arraStrings2[2]);
        System.out.println(arraStrings2.length);

        Integer[][] onErray = {
            {1,2,3},
            {2,4},
        };
        System.out.println(onErray[1][1]);
        

    }
}
