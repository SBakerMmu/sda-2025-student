package contracts;

class Product {

    private final double minimumSellingPrice;
    private double discount;
    private double fullPrice;

    public Product(double fullPrice, double minimumSellingPrice)
    {
        this.fullPrice = fullPrice;
        this.minimumSellingPrice = minimumSellingPrice;
        checkInvariants();
    }

    public void setDiscount(double discount) {
        //check pre- and post-conditions
        this.discount = discount;
        checkInvariants();
    }

    public void setFullPrice(double fullPrice) {
        //check pre- and post-conditions
        this.fullPrice = fullPrice;
        checkInvariants();
    }

    public double getSellingPrice() {
        return fullPrice - discount;
    }


    private void checkInvariants()
    {
        if(minimumSellingPrice < 0d)
        {
            //throw execption
        }

        if(getSellingPrice() < minimumSellingPrice)
        {
            //throw execption
        }
    }

}
