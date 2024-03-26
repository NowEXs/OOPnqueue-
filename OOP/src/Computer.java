public class Computer extends Student implements RoleChecker, Rerservable{
    private Student std_data;
    private int comp_id, status;
    private boolean isReservable;


    public Computer() {
        this(0, null);
    }
    public Computer(int status,Student std_data) {
        this.status = status;
        this.std_data = std_data;
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
    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }
    public boolean isReservable() {
        return isReservable;
    }
    public void isReservable(boolean isReservable) {
        this.isReservable = isReservable;
    }
    public void setStd_data(Student std_data) {
        this.std_data = std_data;
    }
    public Student getStd_data() {
        return std_data;
    }
}
