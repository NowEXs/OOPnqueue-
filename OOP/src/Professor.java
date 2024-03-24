public class Professor extends User implements Checkable {
    private final String password = "1234";
    public void viewComment(){

    }
//    public boolean isCheckable(){
//
//    } for run
    public Professor(){

        this.setRole(2);
    }

    @Override
    public void Checkable() {

    }

    public String getPassword() {
        return password;
    }

    @Override
    public int getRole() {
        return 2;
    }
}
