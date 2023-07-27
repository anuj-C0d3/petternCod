class Object {
    int a;
    String name;

    public static void main(String[] args) {
        // declare the variable
        // create the object
        int num = 9;// primitive
        Object obj = new Object(); // Reference
        System.out.println(obj.name); /*
                                       * name is variable of obj
                                       * object so we cant access without using obj
                                       */
        System.out.println(obj.a);
        Object obj2 = new Object();
        obj.name = "Rahul";
        System.out.println("obj name ="+obj.name);
        obj2.name = "Krishna";
        System.out.println("obj2 name ="+obj2.name);
    }
}
