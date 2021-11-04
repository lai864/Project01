package Package_08;
/*新手机*/
public class NewPhone extends Phone{
    @Override//判断子类是否成功重写父类方法
        public void call(String name){
            System.out.println("开启视频功能");
            //System.out.println("给"+name+"打电话");
            super.call("巨魔叔叔");
        }
}
