// 6.092: Assignment 3
package Lect3;

class Marathon{
    public static void main(String[] args) {
        String[] names ={
            "Elena","Thomas","Hamilton","Suzie",
            "Phil","Matt","Alex","Emma","John",
            "James","Jane","Emily","Daniel","Neda",
            "Aaron","Kate"
        };

        int[] times= {
            341,273,278,329,445,402,388,275,243,334,412,393,
            299,343,317,265
        };

        int first_index = 0;
        int first_time = 500;
        int second_index = 0;
        int second_time = 500;

        for(int i = 0; i < times.length; i++){
            if(times[i] < first_time){
                first_time = times[i];
                first_index = i;
            }
        }

        for(int i = 0; i < times.length; i++){
            if(times[i] < second_time && times[i] != first_time){
                second_time = times[i];
                second_index = i;
            }
        }

        System.out.println("The fastest runner is " + names[first_index]);
        System.out.println("The second fastest runner is " + names[second_index]);
    }
}