package nj.fun.jk.battles;

import java.util.ArrayList;
import java.util.List;

import nj.fun.jk.dts.Animal;
import nj.fun.jk.dts.Cat;
import nj.fun.jk.dts.Dog;
import nj.fun.jk.dts.Woof;

public class Bt0J_0 {


    private static final List<Animal> item_none = new ArrayList<>();
    private static final List<? extends Animal> item_extends = new ArrayList<>();
    private static final List<? super Animal> item_super = new ArrayList<>();

    public static void addMoreItem0 (){
        item_none.add(new Dog());
//        item_extends.add(new Dog()); not working
        item_super.add(new Dog());
    }


    private static final List<Dog> item_none_dog = new ArrayList<>();
    private static final List<? extends Dog> item_extends_dog = new ArrayList<>();
    private static final List<? super Dog> item_super_dog = new ArrayList<>();

    public static void addMoreItem1 (){
        item_none_dog.add(new Dog());
//        item_extends_dog.add(new Dog()); not working
        item_super_dog.add(new Woof());
    }

    public static void addMoreItem2 (){
//        item_none_dog.add(new Animal()); not working
    }


}
