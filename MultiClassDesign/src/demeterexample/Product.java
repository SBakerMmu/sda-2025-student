package demeterexample;

class Product {
    private final String code;
    private final String name;
    private final String description;
    private final Category category;

    Product(String code, String name, String description, Category category) {
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

    Category getCategory() {
        return category;
    }
}
