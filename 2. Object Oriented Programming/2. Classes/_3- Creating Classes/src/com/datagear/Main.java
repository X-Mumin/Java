package com.datagear;

public class Main {

    public static void main(String[] args){
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        TextBox textBox2 = textBox1;  // two references for the same object

        textBox2.setText("Hello World!");
        System.out.println(textBox1.text);
    }
    // Garbage Collector is triggered immediately
}
