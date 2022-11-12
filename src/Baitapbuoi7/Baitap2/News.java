package Baitapbuoi7.Baitap2;

public class News implements INews {
    int ID;
    String title;
    String PublishDate;
    String Author,Content;
    float AverageRate;
    int[] RateList = new int[3];

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void display() {
        System.out.println("titel: " + title);
        System.out.println("PublishDate: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("AverageRate: " + AverageRate);
    }
    void caculate() {
        for (int i = 0; i < RateList.length; i++) {
            AverageRate += RateList[i];
        }
//        AverageRate = AverageRate / RateList.length;
        AverageRate /= RateList.length;
    }
}
