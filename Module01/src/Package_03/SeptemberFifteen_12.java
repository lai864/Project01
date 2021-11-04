package Package_03;
//100文钱，鸡翁5文一只，鸡母3文一只，鸡雏一文3只，各买几只
public class SeptemberFifteen_12 {
    public static void main(String[] args) {
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
                int z =100-x-y;
//重要的是，x,y,的取值范围和花费100文
                if(z%3==0 &&5*x+3*y+z/3==100){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}
