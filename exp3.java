public class ConstructorPara
{
int x;

public ConstructorPara(int y)
{
x = y;
}

public static void main(String[] args)
{
ConstructorPara myObj = new ConstructorPara(5);

System.out.println(myObj.x);
}
}