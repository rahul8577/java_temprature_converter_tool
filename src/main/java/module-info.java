module com.rahul.javaapp.javafx_app {
	requires javafx.controls;
	requires javafx.fxml;

	requires com.almasb.fxgl.all;

	opens com.rahul.javaapp.javafx_app to javafx.fxml;
	exports com.rahul.javaapp.javafx_app;
}