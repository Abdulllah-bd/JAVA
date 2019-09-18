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
public class PatientQueue {
    ArrayQueue a=new ArrayQueue();
    int idCounter = 0;
    //declare reference variable of array queue or list queue 
    
    void RegisterPatient(String name)   
    {
       idCounter++;
        Patient p = new Patient(idCounter, name);
        try{
        a.enqueue(p);
        }
        catch(QueueOverflowException n){
            System.out.println("QueueOverflowException is found!!!");
        }
    }
    void ServePatient()
    {
    try{
        System.out.println("Patient name is-" +((Patient)a.dequeue()).patientName);
    }
    catch(QueueUnderflowException e){
      System.out.println("QueueUnderflowException is found!!!");
    }
    }
    boolean CanDoctorGoHome()
    {
        if(a.isEmpty()){
      System.out.println("true");
      return true;
    }else{
     System.out.println("false");
      return false;
    }
       
    }
    
    void ShowAllPatient()
    {
        Object [] data=a.toArray();
     
        for (int i = 1; i < data.length; i++) {
        Object key = data[i];
        int j = i - 1;
        while (j >= 0 && (((Patient) key).patientName).compareTo(((Patient)data[i]).patientName) < 0) {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = key;
    }
        for(int i=0;i<data.length;i++){
            System.out.println(((Patient)data[i]).patientName);
        }
    }
    
    void CancelAll()
    {
     a.CancelAll();   
    }
}
