package com.perkins

import java.util.*

/**
 *
 * @author: perkins Zhu
 * @date: 2023/4/27 17:07
 * @description:
 **/
object App {
    val a = 100
    fun sum(a: Int, b: Int) = a + b

    @JvmStatic
    fun main(args: Array<String>) {
        print(sum(1, 2))
        System.out.println(2323)
    }
}


fun main1() {
    // 定义变量
    var name: String = "Alice"
    val age = 30

    // 条件表达式
    val message = if (age > 20) "You are an adult!" else "You are underage."
    println(message)  // 打印 "You are an adult!"

    // 函数
    fun greet(name: String): String {
        return "Hello $name!"
    }
    println(greet("Bob")) // 打印 "Hello Bob!"

    // 类
    class Person(var name: String, var age: Int) {
        fun greet() {
            println("Hello, I'm $name and I'm $age years old!")
        }
    }

    val alice = Person("Alice", 30)
    alice.greet()  // 打印 "Hello, I'm Alice and I'm 30 years old!"
}

fun main() {
    // 栈
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    stack.pop()  // 2



    // 集合
    val set = hashSetOf(1, 2, 3)
    set.add(4)
    set.remove(1)

    // 映射
    val map = mapOf(1 to "a", 2 to "b")
    map[1]  // "a"

    // 排序
    val list = listOf(3, 1, 2)
    list.sorted()  // [1, 2, 3]

    // 二分查找
    val binarySearch = list.binarySearch(2)  // 1

    // 斐波那契数列
    fun fib(n: Int): Int {
        return if (n <= 1) n else fib(n - 1) + fib(n - 2)
    }
    println(fib(10))  // 55

    // 最大公因数
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
    println(gcd(12, 8))  // 4
}
