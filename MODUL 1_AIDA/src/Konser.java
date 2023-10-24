public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket
    // Price) then Create Setter and Getter
    public class Konser {
        // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket
        // Price) then Create Setter and Getter
        private String bandname;
        private String date;
        private String location;
        private int ticketprice;

        public String getBandname() {
            return bandname;
        }

        public void setBandname(String bandname) {
            this.bandname = bandname;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getTicketprice() {
            return ticketprice;
        }

        public void setTicketprice(int ticketprice) {
            this.ticketprice = ticketprice;
        }
    }
}