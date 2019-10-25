package io.turntabl;

public class Borrow {
    private String name;
    private BorrowType borrowType;
    private String date;
    private int id;

    public Borrow(String name, BorrowType borrowType, String date, int id) {
        this.name = name;
        this.borrowType = borrowType;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public BorrowType getBorrowType() {
        return borrowType;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "name='" + name + '\'' +
                ", borrowType=" + borrowType +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
