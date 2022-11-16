package page.todoly;

import control.Button;
import org.openqa.selenium.By;

public class MenuProjectSection {
    public Button menuIconButton= new Button(By.xpath("//button[contains(@aria-label,\"opciones del proyecto\")]"));
    public Button editButton= new Button(By.xpath("//div[text()=\"Editar proyecto\"]"));
    public Button deleteButton= new Button(By.xpath("//div[text()=\"Eliminar proyecto\"]"));

}
