/**
 * Created by son on 2018-10-01.
 */
package Strategy;
public class Character {

    // 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        // 델리게이트
        // 어떤 공격을 할지 '캐릭터 클래스'는 모른다.
        // weapon 인터페이스에서 정의된다.
        if (weapon == null) {
            System.out.println("맨손 공격!");
        } else {
            weapon.doAttack();
        }
    }

    public static void main(String[] args) {
    }
}
