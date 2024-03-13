public abstract class User {
    private String name;
    private Role<Role<Integer>> role;
    /*/ 0 = Pr, 1 = TA, 2 = STD/*/

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public Role<Role<Integer>> getRole() {
        return this.role.getRl();
    }

    public void setRole(Role<Integer> role) {
        this.role.setRole(role);
    }
}
