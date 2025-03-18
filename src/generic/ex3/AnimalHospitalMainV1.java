package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 컴파일 오류가 발생하지 않는다. : 매개변수 체크 실패

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        //dogHospital.set(cat);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); // downcasting 지금 반환타입으로 Animal을 받고 있기 때문에 Dog로 다운케스팅 해준것
        //Animal animal = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);


        // 코드 재사용 O
        // 타입 안전성 X
    }
}
