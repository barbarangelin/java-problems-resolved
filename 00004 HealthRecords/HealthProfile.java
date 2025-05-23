/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthrecords;
import org.joda.time.*;

/**
 *
 * @author Barbara Angelin
 */
public class HealthProfile {
    private String name;
    private String secondName;
    // True for Female and False for Man;
    private boolean sex;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;
    private int age;

    public HealthProfile(String name, String secondName, boolean sex, int day, int month, int year, double height, double weight) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int  ageCalculator (){
        // Note: using JODA API
        LocalDate birthdate = new LocalDate (getYear(), getMonth(), getDay());
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);
        
        setAge(age.getYears());
        return getAge();
   
    }
    
    public void heartRates (){
        int maxFrequence = 220 - ageCalculator();
        double minFrenquenceTarget = maxFrequence/2;
        double maxFrequenceTarget = maxFrequence*(58/100);
        System.out.println("Maximum heart rate: "+ maxFrequence+"bpm.\n");
        System.out.println("Heart race target: "+ minFrenquenceTarget+"bpm - "+ maxFrequence + "bpm.\n");

    }
    
    public void BMICalculator (){
        double imc = getWeight()/(getHeight()*getHeight());
        System.out.println("BMI VALUES:\nUnderweight:less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater\n ");
        String roundedValue = String.format("%.2f", imc);
        System.out.println("Your IMB value:\n"+ roundedValue +".\n");
    }

    @Override
    public String toString() {
        return "HealthProfile{" + "name=" + name + ", secondName=" + secondName + ", sex=" + sex + ", day=" + day + ", month=" + month + ", year=" + year + ", height=" + height + ", weight=" + weight + ", age=" + ageCalculator() + '}';
    }
    
    
}
