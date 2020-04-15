package BaiTapGiaoThem1;

public class FictionBook extends Book{
    private String category;

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int code, String name, int price, String author, String category) {
        super(code, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
