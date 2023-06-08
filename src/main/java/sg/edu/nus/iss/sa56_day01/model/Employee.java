package sg.edu.nus.iss.sa56_day01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//With Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String firstName;
    private String lastName;

    //Without using Lombok need to write all below.
    // public Employee(String id, String firstName, String lastName) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    // }

    // public Employee(){
        
    // }

    // public String getId() {
    //     return id;
    // }

    // public void setId(String id) {
    //     this.id = id;
    // }

    // public String getFirstName() {
    //     return firstName;
    // }

    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }

    // public String getLastName() {
    //     return lastName;
    // }

    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((id == null) ? 0 : id.hashCode());
    //     result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    //     result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Employee other = (Employee) obj;
    //     if (id == null) {
    //         if (other.id != null)
    //             return false;
    //     } else if (!id.equals(other.id))
    //         return false;
    //     if (firstName == null) {
    //         if (other.firstName != null)
    //             return false;
    //     } else if (!firstName.equals(other.firstName))
    //         return false;
    //     if (lastName == null) {
    //         if (other.lastName != null)
    //             return false;
    //     } else if (!lastName.equals(other.lastName))
    //         return false;
    //     return true;
    // }

    // @Override
    // public String toString() {
    //     return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    // }
}
