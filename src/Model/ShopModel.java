package Model;

public class ShopModel {
    public int pid;
    public String showTxt;
    public int number;
    public int price;

    public ShopModel(int pid, String showTxt, int number, int price) {
        this.pid = pid;
        this.showTxt = showTxt;
        this.number = number;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getShowTxt() {
        return showTxt;
    }

    public void setShowTxt(String showTxt) {
        this.showTxt = showTxt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
