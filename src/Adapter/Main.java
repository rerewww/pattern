package Adapter;

/**
 * Created by son on 2018-10-02.
 */
public class Main {
    /**
     * 어댑터 패턴
     * 연관성 없는 두 객체 묶어 사용하기
     *
     * 두 수에 대한 다음 연산을 수행하는 객체를 만들어라.
     * 두 배의 수를 반환: twiceOf(Float):Float
     * 반 의 수를 반환: halfOf(Float):Float
     *
     * 구현 객체 이름은 'Adapter'로 해달라.
     * Math 클래스에서 두 배와 절반을 구하는 함수는 이미 구현되어 있다.
     * @param args
     */
    public static void main(String[] args) {
        // Math클래스에서 제공하는 메서드는 요구사항에 맞지 않으나,
        // Adapter 구현체에서 Math 클래스의 기능을 사용 할 수 있도록 변경한다.
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(100f));
    }
}
