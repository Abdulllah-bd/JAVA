/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author stahsin
 */
public class PatientTester {
    
    
    public static void main(String[] args) {
        PatientQueue obj = new PatientQueue();
        
        //Register
        obj.RegisterPatient("James");
        obj.RegisterPatient("Sophia");
        obj.RegisterPatient("George");
        obj.RegisterPatient("Mary");
        
        //Serve
        obj.ServePatient();
        obj.ServePatient();
        obj.ServePatient();
        
        //Register
        obj.RegisterPatient("Robb");
        obj.RegisterPatient("Snow");
        
        //can doctor go home
        obj.CanDoctorGoHome();
        
        //show sorted
        obj.ShowAllPatient();
        
        //cancel all
        
        obj.CancelAll();
        
        
        
        
    }
    
}
