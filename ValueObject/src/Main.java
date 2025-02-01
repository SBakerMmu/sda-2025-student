import globaltradeitemnumber.CompanyPrefix;
import globaltradeitemnumber.Gtin13;
import globaltradeitemnumber.InvalidException;
import globaltradeitemnumber.ItemReference;

public class Main {
    public static void main(String[] args) {


        try {
            CompanyPrefix prefix = new CompanyPrefix(320000);
            ItemReference reference = new ItemReference(377);
            Gtin13 gtin = new Gtin13(prefix, reference);
            Gtin13 scannedGtin = Gtin13.parse("3200000003774");

            System.out.printf("%s\n", prefix);
            System.out.printf("%s\n", reference);
            System.out.printf("%s\n", gtin);


            if (scannedGtin.equals(gtin)) {
                System.out.printf("%s = %s %b\n", gtin, scannedGtin, gtin.equals(scannedGtin));
            }

        } catch (InvalidException ex) {
            System.out.printf("%s\n", ex);
        }


    }
}
