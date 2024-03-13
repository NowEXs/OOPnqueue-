public class Student extends User {
    private String lab_name, std_name, std_id;

    public Student() {
        this("", "", "");
    }

    public Student(String std_id, String std_name) {
        this(std_id, std_name, "");
    }

    public Student(String std_id, String std_name, String lab_name) {
        this.setStd_id(std_id);
        this.setName(std_name);
        this.setLab_name(lab_name);
        this.setRole(0);
    }

    public String getLab_name() {
        return this.lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
    }

    public String getStd_id() {
        return this.std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }
}
