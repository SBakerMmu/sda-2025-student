package demeterexample;

class Department {
    private final String code;
    private final String name;

    Department(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
