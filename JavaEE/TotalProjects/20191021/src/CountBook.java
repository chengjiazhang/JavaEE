import java.util.Random;

public class CountBook {
    public static void main(String[] args) {
        String[] titles = {"<<Java从入门到精通>>", "<<视频学Java>>", "<<Java编程词典>>"};

        for (int i = 0; i < 5; i++) {
            new Book(titles[new Random().nextInt(3)]);
        }
        System.out.println("总计销售了" + Book.getCounter() + "本图书！");
    }

}

class Book {
    private static int counter = 0;

    public Book(String title) {
        System.out.println("售出图书：" + title);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}