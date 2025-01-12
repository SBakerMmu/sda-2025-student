package demeterexample;

class BetterProduct {
    private final String code;
    private final String name;
    private final String description;
    private final BetterCategory category;

    BetterProduct(String code, String name, String description, BetterCategory category) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    String getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    String getCategoryCode() {
        return category.getCode();
    }

    String getCategoryName() {
        return category.getName();
    }

    String getDepartmentCode() {
        return category.getDepartmentCode();
    }

    String getDepartmentName() {
        return category.getDepartmentName();
    }
}
