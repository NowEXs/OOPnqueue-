public class Professor extends User implements Checkable {
    private static final String password = "1234";
//    public boolean isCheckable(){
//
//    } for run
    public Professor(){

        this.setRole(2);
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
        return 2;
    }
}
