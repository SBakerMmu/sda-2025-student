package facade;

class Discounter {

    private static final double discount0 = 0.0d;
    private static final double discount10 = 0.1d;
    private static final double discount20 = 0.2d;
    private static final double discount30 = 0.3d;
    private static final double discount40 = 0.4d;
    private static final double discount50 = 0.5d;

    private double discount = 0d;


    public double getDiscount() {
        return discount;
    }

    public void setTotal(double total) {
        double totalDiscount = total > 100d ? discount20 : discount0;
        discount = Math.max(discount, totalDiscount);
    }

    public void setDiscountCode(String code) {

        double codeDiscount = switch (code) {
            case "Discount10" -> discount10;
            case "Discount20" -> discount20;
            case "Discount30" -> discount30;
            case "Discount40" -> discount40;
            case "Discount50" -> discount50;
            default -> 0.0d;
        };

        discount = Math.max(discount, codeDiscount);
    }
}


