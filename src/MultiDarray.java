public class MultiDarray {
    public static void main(String[] args) {
        //.............[0]............[1]....
        int num[][]={{1,2,3,4,5,},{6,7,8,9,10}};
        System.out.println(num[0][1]);
        System.out.println(num[1][2]);
        System.out.println(num[1][0]);
        for(int a=0;a<num.length;a++) {
            for(int b=0;b<num[a].length;b++){

                        System.out.print(num[a][b]+"\t");

                    }
            System.out.println("\n");
                }

            }

        }



