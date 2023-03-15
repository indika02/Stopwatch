/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school_management_system;

/**
 *
 * @author Indika senarathna
 */
public class Teachers {
    private int id;
    private String name;
    private int salary;
    
    public Teachers(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int salary(){
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary=salary;
    }
}
