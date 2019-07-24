package Lesson7;

class Contact {
    private String lastName;
    private String firstName;
    private String telephoneNumber;

    public Contact (String lastName, String firstName, String telephoneNumber) {
        this.firstName = lastName;
        this.lastName = firstName;
        this.telephoneNumber = telephoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.lastName = firstName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.lastName = telephoneNumber;
    }
}
