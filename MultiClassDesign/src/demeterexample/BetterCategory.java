package demeterexample;

class BetterCategory {
    private final Department department;
    private final String code;
    private final String name;

    BetterCategory(String code, String name, Department department) {
        this.department = department;
        this.code = code;
        this.name = name;
    }

    public String getDepartmentName() {
        return department.getName();
    }

    public String getDepartmentCode() {
        return department.getCode();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
