//Application with below features :
//Feature 1 : It should capture Student data having Registration Number, Name, Age, Email and permanent address having Street, City, State, Zip Code and store it in File.
//Feature 2 : It should display data stored from the file
//Program should use all the core java concepts that are taught so far like -
//OOPs concepts wherever applicable
//Exception handling
//Collections
//File handling
package org.example;

import java.io.File;
import java.io.IOException;

public interface Add {
    public void addDetails(File file) throws IOException;
    public void viewDetails() throws IOException, ClassNotFoundException;




}

