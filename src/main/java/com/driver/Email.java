package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(newPassword.length()<8)
        {
            return;
        }

        boolean f1=false;
        boolean f2=false;
        boolean f3=false;
        boolean f4=false;
        if(oldPassword.equals(this.password))
        {
            for(int i=0;i<newPassword.length(); i++)
            {
                char ch=newPassword.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    f1=true;
                }
                else if(Character.isLowerCase(ch))
                {
                    f2=true;

                }
                else if(Character.isDigit(ch))
                {
                    f3=true;
                }
                else if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
                {
                    f4=true;
                }
            }



        }

        if(f1 && f2 && f3 && f4)
            this.password=newPassword;
    }
}
