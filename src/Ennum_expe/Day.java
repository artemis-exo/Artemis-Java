package Ennum_expe;

public enum Day {
        SUNDAY("Sunday","Ravivaar"),
        MONDAY("Monday","Somavaar"),
        TUESDAY("Tuesday","Mangalvaar"),
        WEDNESDAY("Wednesday","Budhvaar"),
        THURSDAY("Thursday","Guruvaar"),
        FRIDAY("Friday","Shukravaar"),
        SATURDAY("Saturday","Shanivaar");

        private Day(String lower,String hindi){
                System.out.println("Our constructor called");
                this.lower=lower;
                this.hindi=hindi;
        }

        public String getLower() {
                return lower;
        }

        private String lower;

        private String hindi;

        public String getHindi() {
                return hindi;
        }

        public void  display(){
        System.out.println("Today is "+ this.name());
        }
}
