package me.xhy.kotlin.lang.p2study

/**
 * Created by xuhuaiyu-macpro on 2018/9/24.
 */

fun main(args: Array<String>) {
  useMap(arrayOf("1","2","3"))

  useFlatMap()
}

fun useMap(args: Array<String>) {
  /*
  public inline fun <T, R> Array<out T>.map(transform: (T) -> R): List<R> {
    return mapTo(ArrayList<R>(size), transform)
  }
  */
  /*
  1. args.map({ t -> r}) // 标准 lambda 作为入参的写法
  2. 如 kotlin 、 scala、 groove 语言都有一个特点，就是方法的最后一个参数是 lambda 表达， {} 可以移至 () 的外面
     args.map() { t -> r}
  3. 只有一个 lambda 表示作为参数，那 () 也可以去掉，因为唯一的 lambda 参数又移到了外面，没有其他参数需要些在 () 里了
     args.map {r -> s}
   */
  args.map({println(it)})
  args.map() {println(it)}
  args.map {
    println(it)
  }
}

fun useFlatMap() {
  val strs = arrayOf("a_b_c_d_e_f_g","h", "i_j_k")
  strs.flatMap {
    println(it)
    println(it::class)
    it.split("_") // flatMap 的lambda参数要求返回一个可迭代的对象，再将所有可迭代的对象拼装到最终的一个可迭代对象中
  }.map {
    print("$it ") // 字符串模板
  }

}