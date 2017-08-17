

package classes;


public class Pass 
{
    public String generatePassword() {
int len=8;
char[] pwd = new char[len];
int c = 'A';
int rand = 2;
for (int i=0; i < 8; i++)
{
rand = (int)(Math.random() * 3);
switch(rand) {
case 0: c = '0' + (int)(Math.random() * 10); break;
case 1: c = 'a' + (int)(Math.random() * 26); break;
case 2: c = 'A' + (int)(Math.random() * 26); break;
}
pwd[i] = (char)c;
}
System.out.println(pwd);
return new String(pwd);
}
public static void main(String args[])
{
    Pass p=new Pass();
    p.generatePassword();
}
}
