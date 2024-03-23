public class Computer extends Student implements Rerservable{
    private Student std_data;
    private int comp_id, status;
    private boolean isReservable;


    public Computer() {

    }
    public Computer(String lab_name,String std_name, String std_id,int comp_id,int status) {
        super(lab_name, std_name, std_id);
        this.comp_id = comp_id;
        this.status = status;
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
}
