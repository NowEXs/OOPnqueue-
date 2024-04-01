public class TA extends User implements Checkable{
    private final String password;
//    public boolean isCheckable(){
//
//    } for run
    public TA(){
        this.setRole(1);
        password = null;
    }
    public TA(String pas){
        this.setRole(1);
        this.password = pas;
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
