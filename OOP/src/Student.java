public class Student extends User{
    private String  std_name, std_id, lab_name;

    public Student(){
        this("", "","");
    }
    public Student(String std_name, String std_id, String lab_name){
        this.std_name = std_name;
        this.std_id = std_id;
        this.lab_name = lab_name;
    }
    public void setStd_name(String std_name){
        this.std_name = std_name;
    }
    public String getStd_name(){
        return this.std_name;
    }
    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }
    public String getLab_name(){
        return this.lab_name;
    }
    public void setStd_id(String std_id){
        this.std_id = std_id;
    }
    public String getStd_id(){
        return std_id;
    }
}
