package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by son on 2018-10-03.
 * Leaf 클래스를 컨트롤 하는 역할을 한다.
 * Component 요소를 자식으로 가지기 때문에
 */
public class LocalFolder extends Component {
    private List<Component> children = new ArrayList<>();

    public LocalFolder(String name) {
        super(name);
    }

    // Component 요소를 자식으로 가지기 때문에(leaf 클래스) 컨트롤 하는 메소드를 구현한다.
    public boolean addComponent(final Component component) {
        return children.add(component);
    }

    public List<Component> getChildren() {
        return this.children;
    }
}
