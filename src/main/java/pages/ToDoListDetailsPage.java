package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.DriverManager;
import util.ElementActions;

public class ToDoListDetailsPage extends ElementActions{

	@FindBy(id="ctl00_PlaceHolderMain_AProjects_txtTitle")
	WebElement titleEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_txtNotes")
	WebElement notesEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_imgbtnsaveTodolist")
	//ctl00_PlaceHolderMain_AProjects_imgSaveAndClose
	WebElement okBtnEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_datepickerForDateandTime_datepickerForDateandTimeDate")
	WebElement listCalTxtBoxEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_dtCItem_dtCItemDate")
	WebElement itemCalTxtBoxEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_datepickerForDateandTime_datepickerForDateandTimeDateDatePickerImage")
	WebElement listCalImageEle;
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_dtCItem_dtCItemDateDatePickerImage")
	WebElement itemCalImageEle;
	
	
	@FindBy(id="ctl00_PlaceHolderMain_AProjects_imgbtnEdit")
	WebElement editBtnEle;
	
	
	
	public void enterTitle(String title) {
		titleEle.sendKeys(title);
	}
	public void enterNotes(String notes) {
		notesEle.sendKeys(notes);
	}
	
	public String getTitle() {
		return titleEle.getText().trim();
	}
	
	public String getNotes() {
		return notesEle.getText().trim();
	}
	
	public String getListDate() {
		return listCalTxtBoxEle.getText().trim();
	}
	
	public void setListDateByTxtBox(String date) {
		listCalTxtBoxEle.clear();
		if(!"".equals(date.trim())) {
			listCalTxtBoxEle.sendKeys(date);
		}
	}
	
	public void setItemDateByTxtBox(String date) {
		itemCalTxtBoxEle.clear();
		if(!"".equals(date.trim())) {
			itemCalTxtBoxEle.sendKeys(date);
		}
	}

	// this doesn't appear everytime
	public void save() {
		okBtnEle.click();
		Alert alert = DriverManager.getDriver().switchTo().alert();
		alert.accept();
	}
	
	public void edit() {
		editBtnEle.click();
	}
}
