package me.xhy.kotlin.lang.p1hello

/**
 * Created by xuhuaiyu-macpro on 2018/9/24.
 */

data class User(val id:Int, val name:String)

class HelloKotlin {

  fun test() {
    User::class.constructors.map(::println)
  }

}
