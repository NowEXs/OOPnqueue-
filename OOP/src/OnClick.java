import java.awt.event.*;
import java.util.EventListener;

public interface OnClick extends ActionListener {
    public void pressConfirm(ActionEvent event);
    public void pressCancel(ActionEvent event);

}
