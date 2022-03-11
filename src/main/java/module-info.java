module pl.macugajakub.todoappjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.macugajakub.todoappjavafx to javafx.fxml;
    exports pl.macugajakub.todoappjavafx;
}