package fr.ronan;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Pagination;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Ihm extends Application {

	public void start(Stage primaryStage){
		try {
			Group root = new Group();
			Scene scene = new Scene(root, 800,950, Color.AQUAMARINE);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("ComposantJava");
			
			//1-Label 
			Label la = new Label("Ceci est une étiquette");
			
			//2-Bouton
			Button bu = new Button("Enregistrer");
			bu.setLayoutX(20);
			bu.setLayoutY(35);
			
			//3-Radio Bouton
			RadioButton ra1 = new RadioButton("Radio 1");
			ra1.setLayoutX(130);
			ra1.setLayoutY(35);
			RadioButton ra2 = new RadioButton("Radio 2");
			ra2.setLayoutX(230);
			ra2.setLayoutY(35);
			
			ToggleGroup tg = new ToggleGroup();
			ra1.setToggleGroup(tg);
			ra2.setToggleGroup(tg);
			ra1.setSelected(true);
			
			//4-CheckBox
			CheckBox ch = new CheckBox("Checkbox");
			ch.setLayoutX(230);
			ch.setLayoutY(85);
			
			//5-ChoiceBox
			ChoiceBox<Object> cb = 
					new ChoiceBox<Object>(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
			cb.setLayoutX(330);
			cb.setLayoutY(35);
			cb.setTooltip(new Tooltip("C'est un CB"));
			
			//6-TextField
			TextField te = new TextField();
			te.setLayoutX(20);
			te.setLayoutY(85);
			te.setText("Nom d'utilisateur");
			
			//7-Password Field
			PasswordField pa = new PasswordField();
			pa.setLayoutX(20);
			pa.setLayoutY(125);
			pa.setPromptText("Mot de Passe");
			
			//8-ScrollBar
			ScrollBar sc = new ScrollBar();
			sc.setLayoutX(170);
			sc.setLayoutY(85);
			sc.setOrientation(Orientation.VERTICAL);
			sc.setMin(0);
			sc.setMax(100);
			
			//9-ComboBox
			ComboBox<Object> cmb = 
					new ComboBox<Object>(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
			cmb.getItems().addAll("C");
			cmb.setVisibleRowCount(2);
			
			//10-Slider
			Slider s = new Slider();
			s.setMin(0);
			s.setMax(100);
			s.setShowTickLabels(true);
			s.setLayoutX(20);
			s.setLayoutY(185);
			s.setMinorTickCount(5);
			s.setBlockIncrement(10);
			
			//11-ProgressBar
			ProgressBar pr = new ProgressBar(0.3);
			pr.setLayoutX(20);
			pr.setLayoutY(215);
			pr.setVisible(true);
			pr.setProgress(0.75);
			
			//12-ProgressIndicator
			ProgressIndicator pi = new ProgressIndicator();
			pi.setLayoutX(50);
			pi.setLayoutY(240);
			
			//13-Hyperlink
			Hyperlink hl = new Hyperlink("https://fr.wikipedia.org");
			hl.setLayoutX(20);
			hl.setLayoutY(60);
			
			//15-MenuBar
			MenuBar mb = new MenuBar();
			mb.setLayoutX(400);
			mb.setLayoutY(0);
			Menu file = new Menu("File");
			Menu edit = new Menu("Edit");
			Menu source = new Menu("Source");
			Menu refactor = new Menu("Refactor");
			Menu navigate = new Menu("Navigate");
			Menu search = new Menu("Search");
			Menu project = new Menu("Project");
			Menu run = new Menu("Run");
			Menu window = new Menu("Window");
			Menu help = new Menu("Help");
			mb.getMenus().addAll(file, edit, source, refactor, navigate, search, project, run, window, help);
			MenuItem newFile = new MenuItem("New");
			MenuItem openFile = new MenuItem("Open File");
			MenuItem openProjects = new MenuItem("Open Projects From File System");
			MenuItem recentFiles = new MenuItem("Recent Files");
			MenuItem closeEditor = new MenuItem("Close Editor");
			MenuItem closeAllEditor = new MenuItem("Close All Editors");
			MenuItem save = new MenuItem("Save");
			MenuItem saveAs = new MenuItem("Save As");
			MenuItem saveAll = new MenuItem("Save All");
			MenuItem revert = new MenuItem("Revert");
			MenuItem move = new MenuItem("Move");
			MenuItem rename = new MenuItem("Rename");
			MenuItem refresh = new MenuItem("Refresh");
			MenuItem convertLine = new MenuItem("Convert Line Delimiters To");
			MenuItem print = new MenuItem("Print");
			MenuItem importFiles = new MenuItem("Import");
			MenuItem export = new MenuItem("Export");
			MenuItem properties = new MenuItem("Properties");
			MenuItem swtichWorkspace = new MenuItem("Switch Workspace");
			MenuItem restart = new MenuItem("Restart");
			MenuItem exit = new MenuItem("Exit");
			/*MenuItem javaProject = new MenuItem("Java Project");
			MenuItem projects = new MenuItem("Project");
			MenuItem package1 = new MenuItem("Package");
			MenuItem class1 = new MenuItem("Class");
			MenuItem interface1 = new MenuItem("Interface");
			MenuItem enum1 = new MenuItem("Enum");
			MenuItem record = new MenuItem("Record");
			MenuItem annotation = new MenuItem("Annotation");
			MenuItem sourceFolder = new MenuItem("Source Folder");
			MenuItem javaWorkingSet = new MenuItem("Java Working Set");*/
			file.getItems().addAll(newFile, openFile, openProjects, recentFiles, closeEditor, closeAllEditor, save, saveAs, saveAll, revert, move, rename, refresh, convertLine, print, importFiles, export, properties, swtichWorkspace, restart, exit, new SeparatorMenuItem());
			//newFile.getStyleClass().addAll(javaproject, new SeparatorMenuItem());
			MenuItem undo = new MenuItem("Undo Typing");
			MenuItem redo = new MenuItem("Redo");
			MenuItem cut = new MenuItem("Cut");
			MenuItem copy = new MenuItem("Copy");
			MenuItem copyQualified = new MenuItem("Copy Qualified Name");
			MenuItem paste = new MenuItem("Paste");
			MenuItem delete = new MenuItem("Delete");
			MenuItem select = new MenuItem("Select All");
			MenuItem expand = new MenuItem("Expand Selection To");
			MenuItem toggle = new MenuItem("Toggle Block Selection");
			MenuItem findReplace = new MenuItem("Find/Replace");
			MenuItem findNext = new MenuItem("Find Next");
			MenuItem findPrevious = new MenuItem("Find Previous");
			MenuItem incrementalFindNext = new MenuItem("Incremental Find Next");
			MenuItem incrementalFindPrevious = new MenuItem("Incremental Find Previous");
			MenuItem addBookmark = new MenuItem("Add Bookmark");
			MenuItem addTask = new MenuItem("Add Task");
			MenuItem smartInsert = new MenuItem("Smart Insert Mode");
			MenuItem showTooltip = new MenuItem("Show Tooltil Description");
			MenuItem contentAssit = new MenuItem("Content Assist");
			MenuItem wordCompletion = new MenuItem("Word Completion");
			MenuItem quickFix = new MenuItem("Quick Fix");
			MenuItem setEncoding = new MenuItem("Set Encoding");
			edit.getItems().addAll(undo, redo, cut, copy, copyQualified, paste, delete, select, expand, toggle, findReplace, findNext, findPrevious, incrementalFindNext, incrementalFindPrevious, addBookmark, addTask, smartInsert, showTooltip, contentAssit, wordCompletion, quickFix, setEncoding, new SeparatorMenuItem());
			
			
			//16-DatePicker
			DatePicker dp = new DatePicker();
			dp.setValue(LocalDate.of(2020, 07, 28));
			long l = ChronoUnit.DAYS.between(dp.getValue(), dp.getValue().plusDays(24));
			System.out.println(l);
			dp.setLayoutX(20);
			dp.setLayoutY(300);
			
			//17-Pagination
			Pagination page = new Pagination();
			page.setPageFactory((Integer pageid) ->go(pageid));
			page.setLayoutX(550);
			page.setLayoutY(700);
			
			//18-Text
			Text txt = new Text();
			txt.setText("Jetant un châle sur la table... Déroutés par l'extraordinaire éclat de ses yeux verts me paraissent perfides comme ceux d'un condamné. Protégé par les deux artistes célèbres, qu'il trouverait un biais. Réflexion faite, il doit bien se trouver quelque espion du cardinal. Épouvanté, j'y suis resté deux ans sans que personne lui parlât jusqu'au lendemain. Arrêtons-nous sur ces trois points, ce sont nos propres têtes qui sont en plus grand danger, guerrier ! Oubliant donc cette timidité qui doit, à l'augmentation des heures ouvrables, soit par celui du contentement d'elle, si elle a disparu. Surpris de le rencontrer ici ?\r\n" + 
					"\r\n" + 
					"");
			txt.setLayoutX(20);
			txt.setLayoutY(610);
			txt.setWrappingWidth(300);
			txt.setTextAlignment(TextAlignment.JUSTIFY);
			txt.setFont(Font.font("Mongolian Baiti", 15));
			
			List<?> li = Font.getFamilies();
			for (int i =0; i<li.size(); i++) 
				System.out.println(li.get(i));
			
			
			
			root.getChildren().addAll(la, bu, ra1, ra2, cb, te, pa, sc, s, pr, pi, hl, mb, dp, page, txt, ch);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Group go(int pageid) {
		Group gr = new Group();
		gr.getChildren().add(new Button(String.valueOf(pageid+1)));
		return gr;
	}
	
	public static void startIhm() {
		launch();
	}
		
	}