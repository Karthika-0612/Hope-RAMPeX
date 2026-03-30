public class zigzag{
    public static void main(String[] args){
String s="PAYPALISHIRING";
int numRows=3;
    
if(numRows==1||s.length()<=numRows){
    System.out.println(s);
}
int currRow=0;
boolean flag=false;
StringBuilder[] rows=new StringBuilder[numRows];
for(int i=0;i<numRows;i++){
rows[i]=new StringBuilder();
}
for(char c:s.toCharArray()){
    rows[currRow].append(c);
if(currRow==0||currRow==numRows-1){
    flag=!flag;
}
currRow+=flag?1:-1;

}
StringBuilder res=new StringBuilder();
for(StringBuilder row:rows){
    res.append(row);
}
System.out.println( res.toString());
}
}