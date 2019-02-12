/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.ControllerInterface;
import controllers.GeneralController;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import models.Employee;
import models.Loan;
import models.Parameter;
import models.Role;
import models.Roleemployee;
import models.Status;
import models.Statusloan;
import org.hibernate.SessionFactory;

/**
 *
 * @author gandol
 */
public class Kredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = NewHibernateUtil.getSessionFactory();

        //======================= EMPLOYEE *=============================
//        EmployeeDAO dao = new EmployeeDAO(factory);
//        Employee employee = new Employee();
//        EmployeeController ec = new EmployeeController(factory);
//        employee.setNik("199607262019011006");
//        employee.setName("mail 3");
//        employee.setPhoneNumber("0895323046870");
//        employee.setEmail("mail@gmail.com");
//        employee.setUsername("mail");
//        employee.setPassword("mail");
//        employee.setSalary(5000000);
//        employee.setStatus("0");
//        employee.setIsDelete("1");
//
////        System.out.println(dao.functions(employee, 2));
//        for (Employee e : dao.functions(employee, 3)) {
//            System.out.println("NIK : " + e.getNik());
//            System.out.println("Name : " + e.getName());
//            System.out.println("Phone : " + e.getPhoneNumber());
//            System.out.println("Email : " + e.getEmail());
//            System.out.println("Salary : " + e.getSalary());
//        }
//        for (Employee e : ec.getDataAll()) {
//            System.out.println("NIK"+ e.getNik());
//        }
        //======================= ROLE *=============================
//        RoleDAO rdao = new RoleDAO(factory);
//        Role role = new Role();
//        
//        role.setId("R4");
//        role.setPosition("");
//
////        System.out.println(dao.functions(employee, 2));
//        for (Role r : rdao.functions(role, 2)) {
//            System.out.println("ID : " + r.getId());
//            System.out.println("Position : " + r.getPosition());
//        }
        //======================= ROLE EMPLOYEE =============================
//        RoleEmployeeDAO redao = new RoleEmployeeDAO(factory);
//        Roleemployee roleemployee = new Roleemployee();
//
//        roleemployee.setId("RE006");
////        roleemployee.setIdRole(em);
////        roleemployee.setNik("");
//
////        System.out.println(dao.functions(employee, 2));
//        for (Roleemployee re : redao.functions(roleemployee, 3)) {
//            System.out.println("ID : " + re.getId());
//            System.out.println("NIK : " + re.getNik());
//            System.out.println("ID Role : " + re.getIdRole());
//        }
//        
//        for (Roleemployee re : redao.getAll()) {
//            System.out.println(re.getId());
////            System.out.println(re.getIdRole());
////            System.out.println(re.getNik());
//        }
        //======================= PARAMETER *=============================
//        ParameterDAO pdao = new ParameterDAO(factory);
//        Parameter parameter = new Parameter();
//        
//        parameter.setId("");
//        parameter.setInformation("");
//        parameter.setParameter(new BigDecimal("12"));
//
////        System.out.println(dao.functions(employee, 2));
//        for (Parameter p : pdao.functions(parameter, 3)) {
//            System.out.println("ID : " + p.getId());
//            System.out.println("Information : " + p.getInformation());
//            System.out.println("Parameter : " + p.getParameter());
//        }
        //======================= LOAN =============================
//        LoanDAO ldao = new LoanDAO(factory);
//        Loan loan = new Loan();
//        
//        loan.setId("LN002");
////        loan.setNik("");
////        loan.setAdmin("");
////        loan.setNominal(0);
////        loan.setLoanDuration(0);
////        loan.setMonthlyPayment("");
////        loan.setStatus("");
//        
//
////        System.out.println(dao.functions(employee, 2));
//        for (Loan l : ldao.functions(loan, 3)) {
//            System.out.println("ID : " + l.getId());
////            System.out.println("NIK : " + l.getNik());
////            System.out.println("Admin : " + l.getAdmin());
////            System.out.println("Nominal : " + l.getNominal());
////            System.out.println("Loan Duration : " + l.getLoanDuration());
////            System.out.println("Monthly Payment : " + l.getMonthlyPayment());
////            System.out.println("Status : " + l.getStatus());
//        }
////        
////        for (Roleemployee re : redao.getAll()) {
////            System.out.println(re.getId());
////            System.out.println(re.getIdRole());
////            System.out.println(re.getNik());
////        }
        //======================= STATUS LOAN =============================
//        StatusLoanDAO sldao = new StatusLoanDAO(factory);
//        Statusloan s = new Statusloan();
//        
//        s.setId("SL00005");
////        s.setIdLoan("");
////        s.setIdStatus("");
////        s.setDateTime("");
//        
//
////        System.out.println(dao.functions(employee, 2));
//        for (Statusloan sl : sldao.functions(s, 3)) {
//            System.out.println("ID : " + sl.getId());
////            System.out.println("ID Loan : " + sl.getIdLoan());
////            System.out.println("ID Status : " + sl.getIdStatus());
////            System.out.println("Date Time : " + sl.getDateTime());
////        }
////        
////        for (Roleemployee re : redao.getAll()) {
////            System.out.println(re.getId());
////            System.out.println(re.getIdRole());
////            System.out.println(re.getNik());
//        }
        //======================= STATUS *=============================
//        StatusDAO status = new StatusDAO(factory);
//        Status st = new Status();
//
//        st.setId("ST01");
//        st.setName("");
//
////        System.out.println(dao.functions(employee, 2));
//        for (Status s : status.functions(st, 3)) {
//            System.out.println("ID : " + s.getId());
//            System.out.println("Name : " + s.getName());
//        }

//        ControllerInterface<Employee> ci = new GeneralController<>(factory, new Employee());
//        ControllerInterface<Loan> ci1 = new GeneralController<>(factory, new Loan());
//        ControllerInterface<Status> ci2 = new GeneralController<>(factory, new Status());
        
//        Employee ee = new Employee("00014698");
//        ci.delete(ee);

//        for (Employee employee1 : ci.search("name", "Suwandi")) {
//            System.out.println(employee1.getNik()+"-"+employee1.getName());
//        }
//        for (Loan l : ci1.search("ID", "LN001")) {
//            System.out.println(l.getId());
//        }

//        Loan l = ci1.getById("LN001");
//        List<Statusloan> sl = l.getStatusloanList();
//    
//        System.out.println(sl.get(sl.size() - 1).getIdStatus().getName());

//        Status s = ci2.getById("ST01");
////        for (Statusloan sl : l.getStatusloanList()) {
//            System.out.println(s.getName());
////        }
//        for (Status s : ci2.getAll()) {
//            System.out.println(s.getId()+"-"+s.getName());
//        }
//        Employee employee2 = ci.getById("199607262019011001");
//            System.out.println(employee2.getNik()+"-"+employee2.getName());
//        Loan l = ci1.getById("LN001");
//        System.out.println(l.getId()+"-"+l.getNik().getName());
//          Employee e = new Employee("199607262019011011", "Suwandi", "0895323046870", "suwandidua2@gmail.com", "21", "21", 20000000, "1", "1");
//          Loan e = new Loan("LN002",12000000, 6, 2000000, "ST01");

Loan e = new Loan();

        e.setId(
                "LN003");
        Employee e1 = new Employee("199607262019011003");
        Employee e2 = new Employee("");

        e.setNik(e1);

//        e.setAdmin(e2);

        e.setNominal(
                12000000);
        e.setLoanDuration(
                6);
        e.setMonthlyPayment(
                2000000);
        e.setStatus(
                "ST01");
//          ci.saveOrUpdate(e);
//          ci1.saveOrUpdate(e);  

//          ci.delete(e);
    }

}
