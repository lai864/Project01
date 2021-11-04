package Package_09.Lambda_02;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
//        String s1 = getString(()->{
//            return "巨魔叔叔";
//        });
//
        String s = getString(()->"巨魔叔叔");
        System.out.println(s);


        Integer i = getInteger(()->30);
        System.out.println(i);
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }

    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }
}
