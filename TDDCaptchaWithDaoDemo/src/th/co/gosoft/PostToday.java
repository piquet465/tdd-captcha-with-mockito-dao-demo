package th.co.gosoft;

public class PostToday {
    private String title;
    private int amount;
    private String[] itemTitleList;

    public String[] getItemTitleList() {
        return itemTitleList;
    }

    public void setItemTitleList(String[] itemTitleList) {
        this.itemTitleList = itemTitleList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
