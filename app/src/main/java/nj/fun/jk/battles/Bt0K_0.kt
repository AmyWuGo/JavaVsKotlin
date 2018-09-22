package nj.`fun` .jk.battles

import nj.`fun`.jk.dts.Animal
import nj.`fun`.jk.dts.Dog
import nj.`fun`.jk.dts.Woof
import java.util.ArrayList

object Bt0K_0{


    private val item_none = ArrayList<Dog>()
    private val item_extends :ArrayList<out Dog> = arrayListOf()
    private val item_super:ArrayList<in Dog> = arrayListOf()

    fun addMoreItem0() {
        item_none.add(Dog())
//        item_extends.add(Dog()) not working
        item_super.add(Dog())
    }

    fun addMoreItem1() {
//        item_none.add(Animal()) not working
//        item_extends.add(Animal()) not working
//        item_super.add(Animal()) not working
    }

    fun addMoreItem2() {
        item_none.add(Woof())
//        item_extends.add(Woof()) not working
        item_super.add(Woof())
    }



}