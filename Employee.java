class Employee {

    String name;
    String email;
    String phone;

    Employee(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Jayashree", "jay@gmail.com", "0000000000");

        emp.display();
    }
}