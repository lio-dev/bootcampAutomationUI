package page.todoly;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectSection {
    public MenuProjectSection menuProjectSection= new MenuProjectSection();
    public Button addNewProjecButton = new Button(By.xpath("//button[contains(@aria-label,'dir proyecto')]"));
    public TextBox nameProjectTxtBox= new TextBox(By.id("edit_project_modal_field_name"));
    public Button addButton = new Button(By.xpath("//footer/button[contains(text(),'adir')]"));

    public TextBox editProjectTxtBox= new TextBox(By.xpath("edit_project_modal_field_name"));

    public Button saveButton= new Button(By.xpath("//button[text()=\"Guardar\"]"));

    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[text()='"+nameProject+"']"));
        return projectCreated;
    }

}
