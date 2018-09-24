package me.xhy.kotlin.lang.p1hello

/**
 * Created by xuhuaiyu-macpro on 2018/9/24.
 */

fun main(args: Array<String>) {
  // 将java代码拷贝至kotlin文件，会提示转换为kotlin代码
  // name 参数，如果再次传入 null， 更安全的 kotlin 会在编译期间就报错
  // val user = User(1, null)
  val user = User(1, "in kotlin")
  println(user)

  HelloKotlin::class.constructors.map(::println)
  User::class.constructors.map(::println)
}