module com.example.zhuldyzai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zhuldyzai to javafx.fxml;
    exports com.example.zhuldyzai;
}