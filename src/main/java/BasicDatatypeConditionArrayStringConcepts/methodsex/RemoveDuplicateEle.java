package BasicDatatypeConditionArrayStringConcepts.methodsex;

public class RemoveDuplicateEle {

    public static void dupArray(int allEle[])
    {
        for (int i = 0; i < allEle.length; i++) {
            for (int j = i+1; j <allEle.length; j++) {
                if (allEle[i]==allEle[j])
                {
                    allEle[j]=0;
                }
            }
        }
        for (int i = 0; i <allEle.length ; i++) {
            if (allEle[i]!=0)
            {
                System.out.println(allEle[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,20,30,40,30,40,50};
        int eleArray[]=arr;
        dupArray(eleArray);
    }
}
