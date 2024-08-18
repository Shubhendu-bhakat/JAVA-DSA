public class towerOfhonoi {
    public static void towerOFHonoi(int disks,String source,String helper,String des){
        if(disks==1){
            System.out.println("transfer disk "+disks +" from "+source+" to "+des);
            return;
        }
        //transfer n-1 disks src to helper  
        towerOFHonoi(disks-1, source, des, helper);
        System.out.println("transfer disk "+ disks +" from "+ source +" to "+ helper);
        //
        towerOFHonoi(disks-1, des, source, helper);

    }
    public static void main(String[] args) {
        towerOFHonoi(4, "A", "B", "C");
    }
}
