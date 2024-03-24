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
        this.Availability();
    }

    @Override
    public void Availability() {
        if (this.getStatus() == 0) {
            this.setIsReservable(true);
        } else {
            this.setIsReservable(false);
        }
    }
    public int getComp_id() {
        return comp_id;
    }
    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }
    public void setStatus(int status) {
        this.status = status;
        Availability();
    }
    public int getStatus() {
        return status;
    }
    public boolean getIsReservable() {
        return isReservable;
    }
    public void setIsReservable(boolean isReservable) {
        this.isReservable = isReservable;
    }
}
