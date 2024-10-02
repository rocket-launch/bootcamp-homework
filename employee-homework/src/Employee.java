class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int employeeNumber;

    Employee() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (!this.firstName.isBlank() && !lastName.isBlank()) {
            String var10001 = this.firstName.toLowerCase();
            this.email = var10001 + "." + lastName.toLowerCase() + "@mentormakers.com";
        }

    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Employee's age outside the allowed range.");
        }

    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber >= 27560000 && employeeNumber <= 27569999) {
            this.employeeNumber = employeeNumber;
        } else {
            System.out.println("Employee's number outside the allowed range.");
        }

    }

    public void printEmployeeData() {
        System.out.print("Name: " + this.firstName + "\nLastname: " + this.lastName + "\nE-mail: " + this.email + "\nAge: " + this.age + "\nEmployee Number: " + this.employeeNumber + ".\n");
    }
}