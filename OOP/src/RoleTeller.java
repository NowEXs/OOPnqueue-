
public class RoleTeller<role> {
    private String name;
    private role objRole;

    public RoleTeller(role obj, String name){
        this.objRole = obj;
        this.setName(name);
    }

    public role getObj(){
        return this.objRole;
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
        System.out.println(std.getObj().getRole());
    }
}
