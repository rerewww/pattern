/**
 * Created by son on 2018-10-01.
 */
package Strategy;
public class Main {
    /**
     * 스트레티지 패턴
     * 여러 알고리즘을 하나의 인터페이스 (추상적인 접근점)을 만들어
     * 접근점에서 서로 교환 가능하도록 하는 패턴
     * @param args
     */
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }
}
