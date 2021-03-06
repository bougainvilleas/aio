package org.bougainvilleas.base.jvm.runtime.method;

/**
 * method area 举例
 *
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        int x=500;
        int y=100;
        int a=x/y;
        int b=50;
        System.out.println(a+b);
    }
}
/**
 * Classfile /D:/develop/java/base4java/jvm/build/classes/java/main/org/bougainvillea/java/jvm/runtime/method/MethodAreaDemo.class
 *   Last modified 2021-2-6; size 688 bytes
 *   MD5 checksum 50a5c90884d365b14660f31859743ecf
 *   Compiled from "MethodAreaDemo.java"
 * public class org.bougainvillea.java.jvm.runtime.method.MethodAreaDemo
 *   minor version: 0
 *   major version: 52
 *   flags: ACC_PUBLIC, ACC_SUPER
 * Constant pool:
 *    #1 = Methodref          #5.#24         // java/lang/Object."<init>":()V
 *    #2 = Fieldref           #25.#26        // java/lang/System.out:Ljava/io/PrintStream;
 *    #3 = Methodref          #27.#28        // java/io/PrintStream.println:(I)V
 *    #4 = Class              #29            // org/bougainvillea/java/jvm/runtime/method/MethodAreaDemo
 *    #5 = Class              #30            // java/lang/Object
 *    #6 = Utf8               <init>
 *    #7 = Utf8               ()V
 *    #8 = Utf8               Code
 *    #9 = Utf8               LineNumberTable
 *   #10 = Utf8               LocalVariableTable
 *   #11 = Utf8               this
 *   #12 = Utf8               Lorg/bougainvillea/java/jvm/runtime/method/MethodAreaDemo;
 *   #13 = Utf8               main
 *   #14 = Utf8               ([Ljava/lang/String;)V
 *   #15 = Utf8               args
 *   #16 = Utf8               [Ljava/lang/String;
 *   #17 = Utf8               x
 *   #18 = Utf8               I
 *   #19 = Utf8               y
 *   #20 = Utf8               a
 *   #21 = Utf8               b
 *   #22 = Utf8               SourceFile
 *   #23 = Utf8               MethodAreaDemo.java
 *   #24 = NameAndType        #6:#7          // "<init>":()V
 *   #25 = Class              #31            // java/lang/System
 *   #26 = NameAndType        #32:#33        // out:Ljava/io/PrintStream;
 *   #27 = Class              #34            // java/io/PrintStream
 *   #28 = NameAndType        #35:#36        // println:(I)V
 *   #29 = Utf8               org/bougainvillea/java/jvm/runtime/method/MethodAreaDemo
 *   #30 = Utf8               java/lang/Object
 *   #31 = Utf8               java/lang/System
 *   #32 = Utf8               out
 *   #33 = Utf8               Ljava/io/PrintStream;
 *   #34 = Utf8               java/io/PrintStream
 *   #35 = Utf8               println
 *   #36 = Utf8               (I)V
 * {
 *   public org.bougainvillea.java.jvm.runtime.method.MethodAreaDemo();
 *     descriptor: ()V
 *     flags: ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 7: 0
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *             0       5     0  this   Lorg/bougainvillea/java/jvm/runtime/method/MethodAreaDemo;
 *
 *   public static void main(java.lang.String[]);
 *     descriptor: ([Ljava/lang/String;)V
 *     flags: ACC_PUBLIC, ACC_STATIC
 *     Code:
 *       stack=3, locals=5, args_size=1
 *          0: sipush        500
 *          3: istore_1
 *          4: bipush        100
 *          6: istore_2
 *          7: iload_1
 *          8: iload_2
 *          9: idiv
 *         10: istore_3
 *         11: bipush        50
 *         13: istore        4
 *         15: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *         18: iload_3
 *         19: iload         4
 *         21: iadd
 *         22: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
 *         25: return
 *       LineNumberTable:
 *         line 9: 0
 *         line 10: 4
 *         line 11: 7
 *         line 12: 11
 *         line 13: 15
 *         line 14: 25
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *             0      26     0  args   [Ljava/lang/String;
 *             4      22     1     x   I
 *             7      19     2     y   I
 *            11      15     3     a   I
 *            15      11     4     b   I
 * }
 * SourceFile: "MethodAreaDemo.java"
 */