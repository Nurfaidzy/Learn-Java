public class LearnIfStatement {
    public static void main(String[] args) {
        //pada ifstatement nya sama aja tidak ada hal identik yang bebeda
        int a = 50;
        int batas = 100;

        if(a>batas){
            System.out.print("ini nilai bagus");
        }else{
            System.out.print("ini nilai tdk bagus");     
        }

        // untuk switch case juga sama tidak ada berbeda
        switch (a) {
            case 50:
            System.out.print("ini nilai tdk bagus");              
                break;
            default:
                break;
        }
    }
    
}
