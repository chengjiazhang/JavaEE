package com.banyuan.test01;
public class Test {
    public static void main(String[] args) {
        Book book=new Book("<<Java>>","明日科技",50);
        System.out.println("书名："+book.getTitle());
        System.out.println("作者："+book.getAuthor());
        System.out.println("价格："+book.getPrice());
    }
}
