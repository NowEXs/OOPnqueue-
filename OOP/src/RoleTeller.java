
public class RoleTeller<role> {
    private role rl;
    private String name;

    public RoleTeller(role role, String name){
        this.setRl(role);
        this.setName(name);
    }

    public void setRl(role rl){
        this.rl = rl;
    }

    public RoleTeller<role> getRl(){
        return (RoleTeller<role>) this.rl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //บอกว่าป็นใคร
    public static void main(String[] args) {
        RoleTeller<Student> std = new RoleTeller<>(new Student(), "Student");
        RoleTeller<TA> ta = new RoleTeller<>(new TA(), "TA");
        RoleTeller<Professor> pro = new RoleTeller<>(new Professor(), "Professor");
        System.out.println(std.getName());System.out.println(ta.getName());System.out.println(pro.getName());
    }
}
