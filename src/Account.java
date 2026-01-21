public Account {
    private String Id;
    private String name;
    private double balance;
    public Account() {
        this.Id = "0000";
        this.name = "Unknown";
        this.balance = 0.0;
    }
    public Account(String Id, String name, double balance) {
        this.Id = Id;
        this.name = name;
        this.balance = balance;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getId() {
        return this.Id;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }
    public String toString() {
        return "Account[Id=" + this.Id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}