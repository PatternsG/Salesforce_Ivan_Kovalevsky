package Pages.Modal;

import Pages.Elements.LightningCombobox;
import Pages.Elements.LightningInput;
import Pages.Elements.LightningTextArea;
import Pages.Elements.LitghtningFormattedText;
import Pages.Models.Lead;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class NewLeadModal extends BaseModal {
    public NewLeadModal(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Lead inputLead) {
        new LightningCombobox(driver, "Lead Status").selectByVisibleText(inputLead.getLeadStatus().getName());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningCombobox(driver, "Salutation").selectByVisibleText(inputLead.getSalutation().getName());
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new LightningCombobox(driver, "Rating").selectByVisibleText(inputLead.getRating().getName());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        new LightningTextArea(driver, "Street").setValue(inputLead.getStreet());
        new LightningInput(driver, "City").setValue(inputLead.getCity());
        new LightningInput(driver, "State/Province").setValue(inputLead.getStateProvince());
        new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZipPostalCode());
        new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        new LightningInput(driver, "No. of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningCombobox(driver, "Lead Source").selectByVisibleText(inputLead.getLeadSource().getName());
        new LightningInput(driver, "Annual Revenue").setValue(inputLead.getAnnualRevenue());
        new LightningCombobox(driver, "Industry").selectByVisibleText(inputLead.getIndustry().getName());
        new LightningTextArea(driver, "Description").setValue(inputLead.getDescription());
    }

    public List<String> getActualForm() {
        List<String> list = new ArrayList<>();
        list.add(new LitghtningFormattedText(driver, "Name").getValue());
        list.add(new LitghtningFormattedText(driver, "Company").getValue());
        list.add(new LitghtningFormattedText(driver, "Title").getValue());
        list.add(new LitghtningFormattedText(driver, "Lead Status").getValue());
        list.add(new LitghtningFormattedText(driver, "Phone").getValue());
        list.add(new LitghtningFormattedText(driver, "Email").getValue());
        list.add(new LitghtningFormattedText(driver, "Rating").getValue());
        list.add(new LitghtningFormattedText(driver, "Address").getValue());
        list.add(new LitghtningFormattedText(driver, "Website").getValue());
        list.add(new LitghtningFormattedText(driver, "Annual Revenue").getValue());
        list.add(new LitghtningFormattedText(driver, "Description").getValue());
        list.add(new LitghtningFormattedText(driver, "Lead Source").getValue());
        list.add(new LitghtningFormattedText(driver, "Industry").getValue());
        return list;
    }

    public List<String> getExpectedForm() {
        List<String> list = new ArrayList<>();
        list.add("Mr. Jora Ivanov");
        list.add("TMS");
        list.add("good man");
        list.add("New");
        list.add("333333333");
        list.add("jora@gmail.ru");
        list.add("Hot");
        list.add("streets\n" +
                "city, state 12345\n" +
                "county");
        list.add("jora.com");
        list.add("$175");
        list.add("thanks");
        list.add("Advertisement");
        list.add("Banking");
        return list;
    }
}