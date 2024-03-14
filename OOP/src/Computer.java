public class Computer implements RoleChecker, Rerservable{
    private Student std_data;
    private int comp_id, status;
    private boolean isReservable;


    public Computer() {

    }
    public Computer(int status, int comp_id, Student std_data) {

    }

    @Override
    public void userType(){

    }
    @Override
    public void Availability(){

    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStd_data(Student std_data) {
        this.std_data = std_data;
    }

    public Student getStd_data() {
        return std_data;
    }
}
