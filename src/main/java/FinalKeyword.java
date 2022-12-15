public  class FinalKeyword {


    int k;
    final int s;
    String age;
    static int a;





    FinalKeyword(){
        k=8;
        k=9;
        a=98;
        s=99;

    }

     String  eat(){
        String name="mustafa";

        return name;
    }

    @Override
    public String toString() {
        return "FinalKeyword{" +
                "k=" + k +
                ", s=" + s +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();

        System.out.println("finalKeyword = " + finalKeyword);



        System.out.println("finalKeyword.a = " + finalKeyword.a);


    }
}
