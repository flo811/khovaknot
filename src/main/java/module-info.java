module photino.khovaknot {
    requires javafx.controls;
    requires javafx.fxml;

    opens khovaknot to javafx.fxml;
    exports khovaknot;
}