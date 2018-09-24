package me.xhy.kotlin.lang.p1hello;

/**
 * Created by xuhuaiyu-macpro on 2018/9/24.
 */
public class HelloJava {
  public static void main(String[] args) {

    // 可以在java中直接使用kotlin定义的类
    // name 在kotlin中定义为 non-null，如果传入 null 值，运行会报错
    User user = new User(1, "a");
    System.out.println(user);

  }
}
