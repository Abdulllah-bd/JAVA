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
public class Patient {

    String patientName;
    int patientID;
    
    public Patient(int id, String name)
    {
        patientID = id;
        patientName = name;
    }
    
}
