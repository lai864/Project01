package Package_08;
/*方法重写注意事项
 *   私有方法不能被重写（父类私有成员子类是不能继承的）
 *   子类方法访问权限不能更低（public>默认>私有）*/
public class Z extends F{
    /*
    @Override
    private void show(){
        System.out.println("Z类中的show()方法被调用");
    }

     */
    /*@Override
    public void method(){
        System.out.println("Z类中的method方法被调用");
    }

     */
    @Override
     void method(){
        System.out.println("Z类中的method方法被调用");
    }
}
