package Package_01;
/*类名作为形参和返回值
 *   方法的形参是类名，其实需要的是该类的对象
 *   方法的返回值是类名，其实返回的是该类的对象*/

/*抽象类名作为形参和返回值
* 方法的形参是抽象类名，其实需要的是该抽象类的子类对象
* 方法的返回值是抽象类名，其实返回的是该抽象的子类对象*/


/*接口名作为形参和返回值
方法的形参是接口名，其实需要的是该接口的实现类对象
* 方法的返回值是接口名，其实返回的是该接口的实现类对象*/
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.animalOperator(c);


        Animal a2 = ao.getAnimal();
        a2.eat();

    }
}
