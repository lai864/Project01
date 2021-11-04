package Package_01;

public class Out {
    private int num=10;
    public void method(){
        int num2 =20;
        class In{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }

        In i = new In();
        i.show();

    }
}
