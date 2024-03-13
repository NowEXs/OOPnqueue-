public abstract class User {
    private String name;
    private int role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }
}
