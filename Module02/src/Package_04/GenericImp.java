package Package_04;

public class GenericImp<T> implements ImpGeneric<T>{
    @Override
    public void eat(T t){
        System.out.println(t);
    }
}
