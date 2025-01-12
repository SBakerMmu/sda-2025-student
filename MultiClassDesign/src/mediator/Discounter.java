package mediator;

class Discounter implements Colleague {

    private static final double discount0 = 0.0d;
    private static final double discount10 = 0.1d;
    private static final double discount20 = 0.2d;
    private static final double discount30 = 0.3d;
    private static final double discount40 = 0.4d;
    private static final double discount50 = 0.5d;

    private final Mediator mediator;
    private double goodsDiscount = 0d;
    private double codeDiscount = 0d;
    private double discountApplied = 0d;

    public Discounter(Mediator mediator) {
        this.mediator = mediator;
    }

    public double getDiscount() {
        return discountApplied;
    }

    public void setGoodsValue(double goodsValue) {
        goodsDiscount = goodsValue > 100d ? discount20 : discount0;
        discountApplied = Math.max(goodsDiscount,codeDiscount);
        mediator.onChanged(this);
    }

    public void setDiscountCode(String code) {

        codeDiscount = switch (code) {
            case "Discount10" -> discount10;
            case "Discount20" -> discount20;
            case "Discount30" -> discount30;
            case "Discount40" -> discount40;
            case "Discount50" -> discount50;
            default -> 0.0d;
        };

        discountApplied = Math.max(codeDiscount, goodsDiscount);
        mediator.onChanged(this);
    }
}


