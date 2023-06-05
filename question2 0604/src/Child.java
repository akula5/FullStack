class Child extends Parent{
    String lastname;
    Child(String lastname) {
       // super(lastname);
        this.lastname = lastname;
        System.out.println(lastname);
    }
    Child(String firstname,String lastname) {
        super(firstname);
        this.lastname = lastname;
        //this.firstname=firstname;
        System.out.println(firstname+" "+lastname);

    }

}
