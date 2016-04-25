public class CTAO{

//Atheer & Nuha we can use two ways either reading the content of the text file by using a file reader or 
//storing file content in an array but I think the 1st way is waayyy better :)

//2^16=65536 "range of keys" we dont need 0 
for(int i=1; i<65536; i++){

public static void readLinesUsingFileReader() throws IOException 
{
    File file = new File("Security.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String line;
    while((line = br.readLine()) != null){
        
        }
    }
    br.close();
    fr.close();
}


/*String or char testKey;

int	c = Hex16.convert(s);
int	p = Coder.decrypt(i, c);


//check the dycrepted message
boolean flag= true;
while(flag){
for(n=0; n<26; n++)
if (!Character.isLetter(p.charAt(n))){
flag=false;

}}


if(flag){
String key=testKey;
}*/

}




}
