package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
        // 오만가지 타입들이 다 들어갈 수 있어서 사용하기 무척 애매하다. : 어떤 타입이던지 다 수용 가능하다.
        // Animal과 그 자식 인자들만 들어올 수 있도록 제한 할 수 있다면 좋을것.-> 타입 매개변수 제한

    }
}
