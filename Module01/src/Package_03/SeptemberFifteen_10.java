package Package_03;
//逢七过
public class SeptemberFifteen_10 {
    public static void main(String[] args) {
        for(int number=1;number<=99;number++){
            if(number%7==0 | number%10==7 | number/10%10==7){
                System.out.println(number);
            }
        }
    }
}
