public class ToStringJava {
//    String name;
//    int age;
//    String lastName;
//
//    public ToStringJava(String name, int age, String lastName){
//        this.name = name;
//        this.age = age;
//        this.lastName = lastName;
//    }
//    public  String ToString(){
//        return name +" "+ age+" "+lastName;
//    }
//
//    public static void main(String[] args) {
//        ToStringJava stu = new ToStringJava("Emeka", 23, "Ugwuagbo");
//        System.out.println(stu.name+"\n"+stu.age+"\n"+stu.lastName);
//    }

    public static void main(String[] args)
 {
         int count = 1;

        while (count <= 10)
            {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
             ++count;
             }
       }
}
