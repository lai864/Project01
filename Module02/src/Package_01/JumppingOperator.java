package Package_01;
//这里是写了两个方法，一个带参void方法，一个非void方法
public class JumppingOperator {
    public void useJumpping(Jumpping j){
        j.jump();
    }

    public  Jumpping getJump(){  //省略了static
        Jumpping j = new Cats();
        return j;
    }
}
