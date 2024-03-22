public class Student extends User{
    private String std_name, lab_name, std_id;

    public Student(){
        this("", "","");
    }
    public Student(String std_name,String  lab_name,String  std_id){
        this.std_id = std_id;
        this.std_name = std_name;
        this.lab_name = lab_name;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getName() {
        return super.getName();
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }
}
