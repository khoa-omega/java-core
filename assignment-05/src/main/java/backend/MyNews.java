package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    private List<News> newsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void insertNew() {
        System.out.println("Nhập vào id: ");
        int id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào title: ");
        String title = scanner.nextLine();

        System.out.println("Nhập vào publish date: ");
        String publishDate = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào author: ");
        String author = scanner.nextLine();

        System.out.println("Nhập vào content: ");
        String content = scanner.nextLine();

        News news = new News(id, title, publishDate, author, content);
        newsList.add(news);
    }

    public void showAllNews() {
        for (INews news : newsList) {
            news.display();
        }
    }

    public void averageRate() {
        System.out.println("Nhập vào id: ");
        int id = scanner.nextInt();

        System.out.println("Nhập vào rate 1: ");
        int rate1 = scanner.nextInt();

        System.out.println("Nhập vào rate 2: ");
        int rate2 = scanner.nextInt();

        System.out.println("Nhập vào rate 3: ");
        int rate3 = scanner.nextInt();

        for (News news : newsList) {
            if (news.getId() == id) {
                int[] rates = {rate1, rate2, rate3};
                news.setRates(rates);
                System.out.println("news.calculate() = " + news.calculate());
            }
        }
    }
}
