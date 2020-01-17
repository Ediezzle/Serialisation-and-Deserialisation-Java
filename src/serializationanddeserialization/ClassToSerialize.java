/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationanddeserialization;

import java.io.Serializable;

/**
 *
 * @author Dev Ops
 */
public class ClassToSerialize implements Serializable
{
        private int age;
        private String name;
        protected static String companyname;
        //[NonSerialized]
        private String accountNumber;
        SupportClass supp = new SupportClass();

        public ClassToSerialize()
        {
            supp.SupportClassString = "In support class";
        }

        public int getAge()
        {
            return this.age;
        }
        
        public void setAge(int age)
        {
            this.age = age;
        }

        public String getName()
        {
            return this.name;
        }
 
        public void setName(String name)
        {
            this.name = name;
        }
        
        public static String getCompanyName()
        {
            return companyname;
        }
        
        public static void setCompanyName(String companyName)
        {
            companyname = companyName;   
        }

        public String getAccountNumber()
        {
            return this.accountNumber;
        }
        
        public void setAccountNumber(String accNum)
        {
            this.accountNumber = accNum;
        }

        public String GetSupportClassString()
        {
            return supp.SupportClassString;
        }
}
