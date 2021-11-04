package Package_08;
/*继承中成员方法的访问特点
*   通过子类对象访问一个方法（当父子有相同的方法）
* 子类成员范围找
* 父类成员范围找
* 如果都没有就报错（不考虑父亲的父亲）*/
public class Md {
    public static void main(String[] args) {
        //创建对象，调用方法
        Dau d = new Dau();
        d.method();
        d.show();
        //报错
        //d.test();
    }
}
