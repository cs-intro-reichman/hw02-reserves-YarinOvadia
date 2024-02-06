public class OneOfEach
 {
public static void main (String[] args)
{
boolean boy = false;
boolean girl = false;
int sum = 0;

while (boy == false || girl == false){
double a = (Math.random() );
if (a >= 0.5){
boy = true;
System.out.print("b ");
}
else {
girl = true;
System.out.print("g ");
}
sum += 1;
}
System.out.println(" ");
System.out.println("You made it... and you now have "+sum+" children.");
}
}