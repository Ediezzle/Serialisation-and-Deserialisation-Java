/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Dev Ops
 */
public class SerialTest implements Serializable
{
    public void SerializeNow()
        {
            try
            {
                ClassToSerialize c = new ClassToSerialize();
                c.setName("bipin");
                c.setAge(26);
                c.setAccountNumber("6258730521");
                ClassToSerialize.companyname = "xyz";

                //Create an instance of FileOutputStream that will store serialized object
                FileOutputStream fos = new FileOutputStream("temp.exe");
                
                //Create an instance of ObjectOutputStream
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                //Serialize the object
                oos.writeObject(c);
                fos.close();
                System.out.println("Serialization successful");
                System.out.println();
            }

            catch(Exception e)
            {
                System.out.println("Ooops! Something went wrong");
                e.printStackTrace();
            }
        }

        public void DeSerializeNow()
        {
            try
            {

                ClassToSerialize c = new ClassToSerialize();
                FileInputStream fis = new FileInputStream("temp.exe");
                ObjectInputStream ois = new ObjectInputStream(fis);

                //Deserialize the object and cast it back to object of type ClassToSerialize
                c = (ClassToSerialize)ois.readObject();
                System.out.println("Deserialization successful!");
                System.out.println("Name: " + c.getName());
                System.out.println("Age: " + c.getAge());
                System.out.println("Company Name: " + ClassToSerialize.getCompanyName());
                System.out.println("AccountNumber: " + c.getAccountNumber());
                System.out.println("Company Name: " + c.GetSupportClassString());
                fis.close();
            }

            catch (Exception e)
            {
                System.out.println("Ooops! Something went wrong");
                e.printStackTrace();
            }
        }
}
