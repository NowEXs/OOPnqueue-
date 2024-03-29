public class TA extends User implements Checkable{
    private final String password = "1234";
//    public boolean isCheckable(){
//
//    } for run
    public TA(){
        this.setRole(1);
    }

    @Override
    public boolean Checkable() {
        return true;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int getRole() {
        return 1;
    }
}
