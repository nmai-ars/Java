package Ex2_9;

public class MyPoint {
    private int x;
    private int y;

    // Constructor không đối số
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor đầy đủ tham số
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter và Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Trả về mảng 2 phần tử [x, y]
    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    // Setter cho x, y cùng lúc
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Tính khoảng cách từ điểm hiện tại đến (x, y) khác
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Tính khoảng cách từ điểm hiện tại đến một đối tượng MyPoint khác
    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

