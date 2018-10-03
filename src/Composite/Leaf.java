package Composite;

/**
 * Created by son on 2018-10-03.
 * 베이스 컴포넌트 외에는 다른 컴포넌트와 섞지 않는다.
 * 하나의 구성물
 */
public class Leaf extends Component {
    private Object data;

    public Leaf(String name) {
        super(name);
    }

    public Object getData() {
        return this.data;
    }

    public void setData(final Object data) {
        this.data = data;
    }
}
