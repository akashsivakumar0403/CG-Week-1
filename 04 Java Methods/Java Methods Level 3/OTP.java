public class OTP {
    public int[] generateOTP(){
        int count=0;
        int[] array=new int[10];
        array[0]=(int) (Math.random()*(999999-100000)+100000);
        for(int i=0;i<10;i++){
            int temp=(int) (Math.random()*(999999-100000)+100000);
            count++;
            for(int j=0;j<count-1;j++){
                if(temp==array[j]){
                    i--;
                    System.out.println("Duplicate, regenerating");
                }else{
                    array[i]=temp;
                }
            }
        }
        return array;
    }
    public boolean unique(int[] array){
        int count=0;
        for(int i=0;i<10;i++){
            int temp=(int) (Math.random()*(999999-100000)+100000);
            count++;
            for(int j=0;j<count-1;j++){
                if(temp==array[j]){
                    i--;
                    return false;
                }else{
                    array[i]=temp;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        OTP obj=new OTP();
        int[] array=new int[10];
        array=obj.generateOTP();
        for(int i=0;i<10;i++){
            System.out.println(array[i]);
        }
        System.out.println(obj.unique(array));
    }
}
