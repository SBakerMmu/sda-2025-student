package globaltradeitemnumber;

public final class Example {

    public static void run() {

        try {
            CompanyPrefix prefix = new CompanyPrefix(320000);
            ItemReference reference = new ItemReference(377);
            GTIN13 gtin = new GTIN13(prefix, reference);
            GTIN13 scannedGtin = GTIN13.parse("3200000003774");

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
