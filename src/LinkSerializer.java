import model.Link;

public class LinkSerializer {

    public static String toJson(final Link link) {
        // BEGIN (write your solution here)

        StringBuilder expDate = new StringBuilder();
        Link.ExpiryDate expDateShFormat = link.getExpiryDate();

        if (expDateShFormat == null) {
            expDate.append("null");
        } else {
            expDate.append("{"
                    + "\"month\":" + expDateShFormat.getMonth()
                    + ","
                    + "\"year\":" + expDateShFormat.getYear()
                    + "}");
        }

        StringBuilder output = new StringBuilder("{"
                + "\"fullUrl\":"
                + (link.getFullUrl() == null ? "null" : ("\"" + link.getFullUrl() + "\""))
                + ","
                + "\"code\":"
                + (link.getCode() == null ? "null" : ("\"" + link.getCode() + "\""))
                + ","
                + "\"expiryDate\":" + expDate
                + "}");
        return output.toString();

        // END
    }
}

