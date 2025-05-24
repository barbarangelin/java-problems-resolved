# Computerization of Health Records from [Java How to Program](https://deitel.com/java-how-to-program-11-e-early-objects-version/)

*This exercise is from the Java How to Program by Deitel, P and Deitel, H. 10ª ed. Chapter 3. Exercise 3.17.*


(Computerization of Health Records) A health care issue that has been discussed in the media lately is the computerization of health records. This possibility is being approached cautiously because of concerns about privacy and the security of sensitive data, among other reasons. [We will discuss these concerns in later exercises.] Computerization of health records could make it easier for patients to share their health profiles and histories among multiple health care professionals. This could improve the quality of health care, help avoid conflicts and erroneous prescriptions, reduce outpatient costs, and save lives. In this exercise, you will design a "starter" HealthProfile class for a person. The class's attributes should include the person's first name, last name, sex, date of birth (consisting of separate attributes for month, day, and year of birth), height (in meters), and weight (in kilograms). Your class should have a constructor that receives these data. For each attribute, provide set and get methods. The class should also include methods that calculate and return the user's age in years, maximum heart rate range, and target heart rate (see Exercise 3.16), and body mass index (BMI; see Exercise 2.33). Write a Java application that requests the person's information, instantiates an object of the HealthProfile class for the person, and prints the information from that object—including the person's first name, last name, gender, date of birth, height, and weight—and then calculates and prints the person's age in years, BMI, maximum heart rate range, and target heart rate. It should also display the BMI value chart from Exercise 2.33.



> The solution have used JODA lib
````
https://www.joda.org/joda-time/
````
