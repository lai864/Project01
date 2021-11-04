package Package_02;

public class SeptemberFourteen_04 {
    public static void main(String[] args) {
        //调用个数，类型要相同
        getMax(3,6);
        //int a =3;
        //int b =6;
        //getMax(a,b);
    }
    public static void getMax(int a,int b){
        if(a>b){
            System.out.println("较大数为a："+a);
        }else{
            System.out.println("较大数为b："+b);
        }
    }
}
