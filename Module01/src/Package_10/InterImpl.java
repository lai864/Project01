package Package_10;

//public class InterImpl implements Inter{
public class InterImpl extends Object implements Inter{
    public InterImpl() {
        super();//默认的，无参方法自带的，可以不写
    }


        @Override
        public void method(){
            System.out.println("method");
        }

        @Override
    public void show(){
            System.out.println("show");
        }


}
