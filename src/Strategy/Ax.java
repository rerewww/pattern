/**
 * Created by son on 2018-10-01.
 */
package Strategy;
public class Ax implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("도끼 공격!");
    }
}
