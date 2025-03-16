package generic.ex1;

public class BowMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> IntegerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        IntegerBox.set(10);
        //IntegerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = IntegerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> StringBox = new GenericBox<String>();
        StringBox.set("hello");
        String str = StringBox.get();
        System.out.println("str = " + str);

        //원하는 모든타입 사용가능
        GenericBox<Double> doubleBox = new GenericBox<>(); //<> 타입 추론, <Integer> 직접 입력
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); // GenericBox가 Integer를 받으니까 객체 생성할때 Integer가 추론 가능하다.
        // GenericBox<> integerBox2 = new GenericBox<Integer>(); 는 자바 문법상 불가능.


        //제네릭 용어와 관례

        // low tpye
        GenericBox integerBox3 = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); 랑 같다.


    }
}
