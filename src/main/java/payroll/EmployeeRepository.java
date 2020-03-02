package payroll;

/*
this interface extends JpaRepository to specify
domain type as Employee and id type as Long
it creates new instances and deletes, updates and finds existing ones
*/


import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
