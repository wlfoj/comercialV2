package main;
	
import java.io.IOException;

import exceptions.NullFieldException;
import exceptions.ObjectRegistred;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Costumer;
import model.ManagementCostumer;
import model.ManagementUsers;
import model.User;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	public static Stage stage;
	public static Scene login;
	public static Scene menu;
	public static Scene guser;
	public static Scene formuser;
	public static Scene gproduct;
	public static Scene gclientes;
	public static Scene gfornecedores;
	public static Scene gcardapio;
	public static Scene gvendas;
	public static Scene formclientes;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			stage = primaryStage;
			primaryStage.setTitle("Comercial Store");
			
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
			login = new Scene(root);
			
			AnchorPane root1 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));
			menu = new Scene(root1);
			
			AnchorPane root2 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorUser.fxml"));
			guser= new Scene(root2);
			
			AnchorPane root3 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/FormularioUser.fxml"));
			formuser= new Scene(root3);
			
			AnchorPane root4 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorProducts.fxml"));
			gproduct= new Scene(root4);
			
			AnchorPane root5 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorCostume.fxml"));
			gclientes= new Scene(root5);
			
			AnchorPane root6 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorProvider.fxml"));
			gfornecedores= new Scene(root6);
			
			AnchorPane root7 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorItens.fxml"));
			gcardapio= new Scene(root7);
			
			AnchorPane root8 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/GerenciadorSales.fxml"));
			gvendas= new Scene(root8);
			
			AnchorPane root9 = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/FormularioCostume.fxml"));
			formclientes= new Scene(root9);
			
			Image anotherIcon = new Image("iconapp.png");
			primaryStage.getIcons().add(anotherIcon);
			
			primaryStage.setScene(login);
			primaryStage.centerOnScreen();
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void scenes(String url) {
		switch(url) {
			case "loginAcess":
				stage.setScene(login);
				break;
			case "Acesso Liberado!":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "guser":
				stage.close();
				stage.setScene(guser);
				stage.centerOnScreen();
				stage.show();
				break;
			case "backUser":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "formUser":
				stage.setScene(formuser);
				stage.centerOnScreen();
				break;
			case "backgUser":
				stage.close();
				stage.setScene(guser);
				stage.centerOnScreen();
				stage.show();
				break;
			case "gproduct":
				stage.setScene(gproduct);
				stage.centerOnScreen();
				break;
			case "gclientes":
				stage.setScene(gclientes);
				stage.centerOnScreen();
				break;
			case "backclientes":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "gfornecedores":
				stage.setScene(gfornecedores);
				stage.centerOnScreen();
				break;
			case "gcardapio":
				stage.setScene(gcardapio);
				stage.centerOnScreen();
				break;
			case "gvendas":
				stage.setScene(gvendas);
				stage.centerOnScreen();
				break;
			case "backfornecedor":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "backprodutos":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "backitens":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "backsales":
				stage.setScene(menu);
				stage.centerOnScreen();
				break;
			case "formClientes":
				stage.setScene(formclientes);
				stage.centerOnScreen();
				break;
			case "backClientes":
				stage.setScene(gclientes);
				stage.centerOnScreen();
				break;
		}
	}
	
	public static void main(String[] args) throws NullFieldException, ObjectRegistred {
		User u = new User();
		u.setLogin("riri");
		u.setPass("1234");
		u.setName("Ricardo Milos");
		ManagementUsers.addUser(u);
		
		User p = new User();
		p.setLogin("pao");
		p.setPass("paozin");
		p.setName("Ricardo Melos");
		ManagementUsers.addUser(p);
		
		User v = new User();
		v.setLogin("batman");
		v.setPass("4321");
		v.setName("Bruce Wayne");
		ManagementUsers.addUser(v);
		
		User a = new User();
		a.setLogin("pedrin");
		a.setPass("1234");
		a.setName("Pedro Henrique Cruz");
		ManagementUsers.addUser(a);
		
		User b = new User();
		b.setLogin("fenix");
		b.setPass("1234");
		b.setName("Fenix");
		ManagementUsers.addUser(b);
		
		Costumer cliente0 = new Costumer();
		cliente0.setCpf("44022245200");
		cliente0.setEmail("testador@exemplo.com");
		cliente0.setName("testador colossal");
		cliente0.setTelefone("75-981020666");
		ManagementCostumer.addCostumer(cliente0);
		
		launch(args);
	}
}
