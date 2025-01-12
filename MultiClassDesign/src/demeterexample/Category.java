package demeterexample;

class Category {
    private final Department department;
    private final String code;
    private final String name;

    Category(String code, String name, Department department) {
        this.department = department;
        this.code = code;
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
