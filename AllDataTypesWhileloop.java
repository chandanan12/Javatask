class AllDataTypesWhileloop{
public static void main (String[] args){
byte b=1;
short s=100;
int i=1;
long l=1000l;
float f=1.5f;
double d=2.5;
char c ='A';
boolean flag=true;
String str="Hello";
int count =1;
while(count <=5){
            System.out.println("Iteration: " + count);
            System.out.println("Byte value: " + b);
            System.out.println("Short value: " + s);
            System.out.println("Int value: " + i);
            System.out.println("Long value: " + l);
            System.out.println("Float value: " + f);
            System.out.println("Double value: " + d);
            System.out.println("Char value: " + c);
            System.out.println("Boolean value: " + flag);
            System.out.println("String value: " + str);
            System.out.println("-----------------------");
			b++;
            s++;
            i++;
            l++;
            f++;
            d++;
            c++;
            flag = !flag; 
            str = str + "!"; 
            count++;
        }
    }
}