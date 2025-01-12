package demeterexample;

public final class Example {

    public static void run() {

        Category category = new Category("DRESS", "Dresses and Skirts", new Department("W", "Womens") );
        Product product = new Product("ABC123", "Marlow Dress", "Summer Dress in blue", category);
        //Chain of calls to reach department name, exposing structure
        System.out.format("Product: %s Department: %s%n", product.getCode(), product.getCategory().getDepartment().getName());


        BetterCategory betterCategory = new BetterCategory("T", "Shirts and T Shirts", new Department("W", "Mens") );
        BetterProduct betterProduct    = new BetterProduct("DEF456", "Henley T Shirt", "Cotton T Shirt in White",betterCategory);
        //Structure is encapsulated
        System.out.format("Product: %s Department: %s%n", betterProduct.getCode(), betterProduct.getDepartmentName());


        ClassA a = new ClassA();
        //instead of chain
        a.getB().getC().doZ();
        //structure is encapsulated
        a.doZ();
    }

}
