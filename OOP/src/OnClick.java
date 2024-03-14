import java.awt.event.*;

public interface OnClick extends ActionListener {
    void pressConfirm(ActionEvent event);
    void pressCancel(ActionEvent event);
}
