Day 04 UML Diagram

<<interface>> Identifiable
+ getId(); String
        ↑
     Person
--------------------------
- id: int
- name: String
- age: int
+ getPersonDetails(): String
        ↑
     Employee
---------------------------
- department: String
+ getPersonDetails(): String (overridden)

Person has Address
---------------------------
Address
- street: String
- city: String
- zipCode: String
+ getFullAddress: String