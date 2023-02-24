package org.example;

public class Encapsulation {

    public static void main(String[] args) {

        customer deposits=new customer();

        deposits.openDeposits();

    }

}


// Inner Class as local member

class customer{

    public void openDeposits(){

        //int loanNumber=123;

        class request{

            private String customerName;

            private String PAN;

            private long Aadhaar;

            private String profession;

            private double cibil;

            private long contact;

            public request() {

            }


            public String request() {

                return customerName;


            }


            public void setCustomerName(String customerName) {

                this.customerName = customerName;

            }


            public String getCustomerName() {

                return customerName;

            }


            public void setProfession(String profession ) {

                this.profession = profession;

            }

            public String getProfession(){

                return profession;

            }


            public long getAadhaar() {

                return Aadhaar;

            }


            public void setAadhaar(int Aadhaar) {

                this.Aadhaar = Aadhaar;

            }

            public void setCibil(int cibil){

                this.cibil=cibil;

            }

            public double getCibil(){

                return cibil;

            }


            public String getPAN() {

                return PAN;

            }


            public void setPAN(String PAN) {

                this.PAN = PAN;

            }


            // constructor overloading



            // parameterized constructor

            public request(String customerName, String PAN, int Aadhaar, String profession, double cibil, int contact)

            {

                this.customerName=customerName;

                this.PAN=PAN;

                this.Aadhaar=Aadhaar;

                this.profession=profession;

                this.cibil=cibil;

                this.contact=contact;

            }

        }

        request fixed=new request();

        fixed.setCustomerName("Shrinidhi");

        fixed.setPAN("CORG858985");

        fixed.setAadhaar(848553845);

        fixed.setProfession("student");


        System.out.println(fixed.getCustomerName()+" "+fixed.getAadhaar()+"  "+fixed.getCibil());


        request fde=new request("Shriya","CPOR586D",58698496,"engineer",9606954.6,900495855);


        System.out.println(fde.getAadhaar()+" "+fde.getPAN()+" "+fde.getCustomerName());

        System.out.println("request for loan received");

    }

}

