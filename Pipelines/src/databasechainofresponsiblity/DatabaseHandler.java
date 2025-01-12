package databasechainofresponsiblity;

class DatabaseHandler implements SearchHandler {
    private final SearchHandler successor;

    public DatabaseHandler(SearchHandler successor) {
        this.successor = successor;
    }

    @Override
    public boolean hasDigitalObject(String doi) {
        boolean lookup = lookupInDatabase(doi);
        if (lookup) return true;
            //Failed to handle the call, pass on to successor
        else return successor.hasDigitalObject(doi);
    }

    private boolean lookupInDatabase(String doi) {
        //look up from database, return true or false if exists
        return false;
    }
}
